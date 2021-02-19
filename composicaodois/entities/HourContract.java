package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HourContract {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	

	public HourContract() {

	}

	public HourContract(Date date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;

	}

	public void setDate(Date date) {
		this.date = date;

	}

	public Date getDate() {
		return date;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Double getValueDouble() {
		return valuePerHour;
	}

	public void setHours(Integer hours) {
		this.hours = hours;

	}

	public Integer getHours() {
		return hours;
	}

	public double totalValue() {
		return hours * valuePerHour;
	}

	@Override
	public String toString() {
		return "HourContract "
				+ "Date: " 
				+ sdf.format(date) 
				+ ", value Per Hour: " 
				+ valuePerHour 
				+ ", Hours:" 
				+ hours 
				;
	}
	
	

}
