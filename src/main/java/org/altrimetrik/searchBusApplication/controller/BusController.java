package org.altrimetrik.searchBusApplication.controller;


import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.altrimetrik.searchBusApplication.model.Bus;
import org.altrimetrik.searchBusApplication.service.BusSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping
public class BusController {
	
	@Autowired
	private BusSearchService busSearchService;

    @ApiOperation("This is the Bus search api")
    @GetMapping("/api/addBus/")
    public String hello() {
    	Bus bus = new Bus();
    	bus.setBusNumber("TN123");
    	bus.setOperatorName("ABC");
    	bus.setSourceCity("Chennai");
    	bus.setDestinationCity("Bangalore");
    	bus.setTravelDate(Date.valueOf("2020-09-02"));
    	bus.setReturnDate(Date.valueOf("2020-09-03"));
    	bus.setArrivalTime("4.00");
    	bus.setDepature("20.00");
    	bus.setDuration("8.00");
    	bus.setPrice(900);
    	busSearchService.insertBus(bus);
    	Bus bus1 = new Bus();
    	bus1.setBusNumber("TN456");
    	bus1.setOperatorName("ABC");
    	bus1.setSourceCity("Chennai");
    	bus1.setDestinationCity("Bangalore");
    	bus1.setTravelDate(Date.valueOf("2020-09-02"));
    	bus1.setReturnDate(Date.valueOf("2020-09-03"));
    	bus1.setArrivalTime("4.00");
    	bus1.setDepature("20.00");
    	bus1.setDuration("8.00");
    	bus1.setPrice(700);
    	busSearchService.insertBus(bus1);
    	Bus bus2 = new Bus();
    	bus2.setBusNumber("TN789");
    	bus2.setOperatorName("ABC");
    	bus2.setSourceCity("Chennai");
    	bus2.setDestinationCity("Bangalore");
    	bus2.setTravelDate(Date.valueOf("2020-09-02"));
    	bus2.setReturnDate(Date.valueOf("2020-09-03"));
    	bus2.setArrivalTime("4.00");
    	bus2.setDepature("20.00");
    	bus2.setDuration("8.00");
    	bus2.setPrice(500);
    	busSearchService.insertBus(bus2);
    	Bus bus3 = new Bus();
    	bus3.setBusNumber("TN123");
    	bus3.setOperatorName("ABC");
    	bus3.setSourceCity("Salem");
    	bus3.setDestinationCity("Bangalore");
    	bus3.setTravelDate(Date.valueOf("2020-09-02"));
    	bus3.setReturnDate(Date.valueOf("2020-09-03"));
    	bus3.setArrivalTime("4.00");
    	bus3.setDepature("20.00");
    	bus3.setDuration("8.00");
    	bus3.setPrice(900);
    	busSearchService.insertBus(bus3);
    	Bus bus4 = new Bus();
    	bus4.setBusNumber("TN012");
    	bus4.setOperatorName("ABC");
    	bus4.setSourceCity("Chennai");
    	bus4.setDestinationCity("Bangalore");
    	bus4.setTravelDate(Date.valueOf("2020-09-03"));
    	bus4.setReturnDate(Date.valueOf("2020-09-04"));
    	bus4.setArrivalTime("4.00");
    	bus4.setDepature("20.00");
    	bus4.setDuration("8.00");
    	bus4.setPrice(750);
    	busSearchService.insertBus(bus4);
    	return "Added New Buses";
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
    
    
    @GetMapping("/api/bus/{sourceCity}/{destinationCity}/{travelDate}")
	public Map<String, Object> searchBuses(@PathVariable("sourceCity") String sourceCity, @PathVariable("destinationCity") String destinationCity,
			@PathVariable("travelDate") String travelDate) {
    	Map<String, Object> resultMap = new HashMap<>();
		Date date = Date.valueOf(travelDate);
		List<Bus> busList = busSearchService.searchBuses(sourceCity,destinationCity,date);
		resultMap.put("BusList", busList);
		resultMap.put("TotalCount", busList.size());
		return resultMap;
	}
    
}
