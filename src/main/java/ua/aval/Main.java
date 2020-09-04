package ua.aval;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import ua.aval.model.Exchange;

public class Main {

	public static final String CURRENCY = "USD";
	public static final String DATE = "2020-02-05";
	
	public static final String QUERY = "SELECT * FROM exchange WHERE name = :name AND date <= :date ORDER BY date DESC LIMIT 1";

	public static void main(String[] args) {

		try (final Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
			
			session.beginTransaction();
			
			final SQLQuery query = session.createSQLQuery(QUERY).addEntity(Exchange.class);
			query.setParameter("name", CURRENCY);
			query.setParameter("date", DATE);

			log(query.uniqueResult());
		} catch (Exception e) {
			log(e.getMessage());
		}
	}
	
	private static final void log(Object s) {
		System.out.println(s);
	}
}
