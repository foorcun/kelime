package com.troyatech.kelime.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.troyatech.kelime.model.Kelime;
import com.troyatech.kelime.repository.IKelimeDal;

@RestController
@RequestMapping("api/")
public class KelimeController {
	
	@Autowired
	//private KelimeRepository kelimeRepository;
	private IKelimeDal JsonKelimeRepository;
	
	@GetMapping("kelimes")
	public List<Kelime> getKelimes() throws FileNotFoundException, IOException, ParseException{
		
		
		//return this.kelimeRepository.findAll();
		return this.JsonKelimeRepository.findAll();
	}

}
