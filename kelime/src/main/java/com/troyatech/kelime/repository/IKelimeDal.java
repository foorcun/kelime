package com.troyatech.kelime.repository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;

import com.troyatech.kelime.model.Kelime;



public interface IKelimeDal {

	
	List<Kelime> findAll() throws FileNotFoundException, IOException, ParseException;
//	Kelime getById(int id);
	Kelime getById(String id) throws FileNotFoundException, IOException, ParseException;
	void Add(Kelime kelime);
	void Update(int id,Kelime kelime);
	void Delete(int id);
	
}
