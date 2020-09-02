package org.altrimetrik.searchBusApplication.dao;

import java.sql.Date;
import java.util.List;

import org.altrimetrik.searchBusApplication.model.Bus;



public interface BusDAO {

	public List<Bus> findBuses(String sourceCity, String destinationCity, Date date);

	public void insertBus(Bus bus);
	
	
	
}
