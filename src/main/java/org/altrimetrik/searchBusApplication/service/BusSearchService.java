package org.altrimetrik.searchBusApplication.service;

import java.sql.Date;
import java.util.List;

import org.altrimetrik.searchBusApplication.model.Bus;


public interface BusSearchService{
	
	public List<Bus> searchBuses(String sourceCity, String destinationCity, Date date);

	public void insertBus(Bus bus);
}