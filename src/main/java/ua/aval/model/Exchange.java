package ua.aval.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "exchange")
public class Exchange {
	
	@Id
	private String name;
	@Temporal(TemporalType.DATE)
	private Date date;
	private double rate;
	
	public String getName() {
		return name;
	}
	
	public Date getDate() {
		return date;
	}
	
	public double getRate() {
		return rate;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	@Override
	public String toString() {
		return name + " | " + date + " | " + rate; 
	}
}
