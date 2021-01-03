package com.troyatech.kelime.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.troyatech.kelime.DataAccess.IKelimeDal;
import com.troyatech.kelime.model.Kelime;

@RestController
@RequestMapping("api/")
public class KelimeController {
	
	
	
//	IKelimeRepo jsonKelimeRepo = new JsonKelimeRepository();
	
	
	@Autowired
	//private KelimeRepository kelimeRepository;
//	private IKelimeRepo JsonKelimeRepository;
	private IKelimeDal kelimeDal;
	
	
	@GetMapping("kelimes")
	public List<Kelime> getKelimes() throws FileNotFoundException, IOException, ParseException{
		
		
		//return this.kelimeRepository.findAll();
//		return this.kelimeDal.findAll();
		return this.kelimeDal.getAll();
	}
	
	@GetMapping("/kelimes/{id}")
	public Kelime getById(@PathVariable String id) throws FileNotFoundException, IOException, ParseException {
		
		return this.kelimeDal.getById(id);
//		return null;
	}

}
