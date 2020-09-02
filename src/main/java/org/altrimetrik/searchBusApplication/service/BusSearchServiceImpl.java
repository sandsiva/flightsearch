package org.altrimetrik.searchBusApplication.service;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.altrimetrik.searchBusApplication.dao.BusDAO;
import org.altrimetrik.searchBusApplication.model.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusSearchServiceImpl implements BusSearchService{

	@Autowired
	private BusDAO busDAO;
	
	@Override
	@Transactional
	public List<Bus> searchBuses(String sourceCity, String destinationCity, Date date) {		
		return busDAO.findBuses(sourceCity, destinationCity,date);
	}

	@Override
	@Transactional
	public void insertBus(Bus bus) {
		busDAO.insertBus(bus);
		
	}

}
