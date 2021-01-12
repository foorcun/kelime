package com.troyatech.kelime.DataAccess;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.Session;

import org.hibernate.query.Query;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.troyatech.kelime.model.Kelime;

@Repository
public class HibernateKelimeDal implements IKelimeDal {

	
	@Autowired
	private EntityManager entityManager;
	
	
//	@Autowired
//	public HibernateKelimeDal(EntityManager entityManager) {
//		this.entityManager = entityManager;
//	}

	@Override
	@Transactional
	public List<Kelime> getAll() throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
//		Session session = entityManager.unwrap(Session.class);
		

		Session currentSession = entityManager.unwrap(Session.class);

//		List<Kelime> kelimes = ((EntityManager) session).createQuery("from Kelime",Kelime.class).getResultList();

		Query<Kelime> query = currentSession.createQuery("from Kelime", Kelime.class);
		
		List<Kelime> kelimes = query.getResultList();
		
		return kelimes;
	}

	@Override
	public Kelime getById(String id) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Kelime kelime) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(kelime);
	}

	@Override
	public void update(Kelime kelime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Kelime kelime) {
		// TODO Auto-generated method stub
		
	}

}
