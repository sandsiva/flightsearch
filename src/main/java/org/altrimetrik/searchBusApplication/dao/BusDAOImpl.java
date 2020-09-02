package org.altrimetrik.searchBusApplication.dao;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.altrimetrik.searchBusApplication.model.Bus;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class BusDAOImpl implements BusDAO {

	// define field for entitymanager	
	private EntityManager entityManager;
		
	//constructor injection
	@Autowired
	public BusDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	

	@Override
	public List<Bus> findBuses(String sourceCity, String destinationCity, Date date) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Bus> theQuery =
				currentSession.createQuery("from Bus b where b.sourceCity=:sourceCity AND b.destinationCity=:destinationCity AND b.travelDate=:travelDate order by b.price", Bus.class);
		
		theQuery.setParameter("sourceCity", sourceCity);
		theQuery.setParameter("destinationCity", destinationCity);
		theQuery.setParameter("travelDate", date);
		List<Bus> buses = theQuery.getResultList();		
		return buses;
	}

	@Override
	public void insertBus(Bus bus) {
		Session currentSession = entityManager.unwrap(Session.class);	
		currentSession.saveOrUpdate(bus);		
	}
}







