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
	@Transactional
	public Kelime getById(long id) throws FileNotFoundException, IOException, ParseException {
		

//		Kelime kelime = entityManager.find(Kelime.class, "1");
		Kelime kelime = entityManager.find(Kelime.class, id);
		System.out.println("dataaccess");
		return kelime;
	}

	@Override
	@Transactional
	public void add(Kelime kelime) {
		// TODO Auto-generated method stub
//		Session currentSession = entityManager.unwrap(Session.class);
//		currentSession.save(kelime);
		
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(kelime);
	}

	@Override
	@Transactional
	public void update(Kelime kelime) {
		// TODO Auto-generated method stub
		
		System.out.println("updateeeeeeeeeeee");
		Session session = entityManager.unwrap(Session.class);
		Kelime kelimeToUpdate = session.get(Kelime.class, kelime.getId());
//		System.out.println(kelimeToUpdate.getId());

		
		kelimeToUpdate.setId(kelime.getId());
		kelimeToUpdate.setGer(kelime.getGer());
		kelimeToUpdate.setEng(kelime.getEng());
		kelimeToUpdate.setTr(kelime.getTr());
		kelimeToUpdate.setAcıklama(kelime.getAcıklama());
		kelimeToUpdate.setPuan(kelime.getPuan());

//		System.out.println(kelimeToUpdate.getId());
//		System.out.println(kelimeToUpdate.getGer());
//		System.out.println("updateeeeeeeeeeee");

		session.update(kelimeToUpdate);
//		session.evict(kelimeToUpdate);
	}

	@Override
	@Transactional
	public void delete(Kelime kelime) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Kelime kelimeToDelete = session.get(Kelime.class, kelime.getId());
		session.delete(kelimeToDelete);
		
	}

}
