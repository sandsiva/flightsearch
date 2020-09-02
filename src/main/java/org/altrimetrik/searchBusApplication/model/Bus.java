package org.altrimetrik.searchBusApplication.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Bus{
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int busId;
	
	@Column(nullable=false)
	private String operatorName;
	
	@Column(nullable=false)
	private String depature;
	
	@Column(nullable=false)
	private String sourceCity;
	
	@Column(nullable=false)
	private String destinationCity;
	
	@Column(nullable=false)
	private Date travelDate;
	
	@Column(nullable=false)
	private Date returnDate;
	
	@Column(nullable=false)
	private String arrivalTime;
	
	@Column(nullable=false)
	private String duration;
	
	@Column
	private long price;
	
	@Column(nullable=false)
	private String busNumber;

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getDepature() {
		return depature;
	}

	public void setDepature(String depature) {
		this.depature = depature;
	}

	public String getSourceCity() {
		return sourceCity;
	}

	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}	
	
}