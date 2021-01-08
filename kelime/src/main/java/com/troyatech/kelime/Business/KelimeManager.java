package com.troyatech.kelime.Business;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.troyatech.kelime.DataAccess.IKelimeDal;
import com.troyatech.kelime.model.Kelime;

@Service
public class KelimeManager implements IKelimeService {
	
	
	@Autowired
	private IKelimeDal kelimeDal;
	
	

	public KelimeManager(IKelimeDal kelimeDal) {
		this.kelimeDal = kelimeDal;
	}

	@Override
	public List<Kelime> getAll() throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		return this.kelimeDal.getAll();
	}

	@Override
	public Kelime getById(String id) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		return this.kelimeDal.getById(id);
	}

	@Override
	public void add(Kelime kelime) {
		// TODO Auto-generated method stub
		kelimeDal.add(kelime);
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
