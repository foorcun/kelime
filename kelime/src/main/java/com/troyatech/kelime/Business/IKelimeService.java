package com.troyatech.kelime.Business;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;

import com.troyatech.kelime.model.Kelime;

public interface IKelimeService {

	List<Kelime> getAll() throws FileNotFoundException, IOException, ParseException;
	Kelime getById(long id) throws FileNotFoundException, IOException, ParseException;
	void add(Kelime kelime);
	void update(Kelime kelime);
	void delete (Kelime kelime);
	
}
