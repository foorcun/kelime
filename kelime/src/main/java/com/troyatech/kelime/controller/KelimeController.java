package com.troyatech.kelime.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.troyatech.kelime.Business.IKelimeService;
import com.troyatech.kelime.model.Kelime;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/")
public class KelimeController {
	
	
	
//	IKelimeRepo jsonKelimeRepo = new JsonKelimeRepository();
	
	
	
	//private KelimeRepository kelimeRepository;
//	private IKelimeRepo JsonKelimeRepository;
//	@Autowired
//	private IKelimeDal kelimeDal;
	@Autowired
	private IKelimeService kelimeManager;
	
	
	@GetMapping("kelimes")
	public List<Kelime> getKelimes() throws FileNotFoundException, IOException, ParseException{
	/////convert başlangıç
//			ConverterFromJson conv = new ConverterFromJson(kelimeManager);
//			conv.convertToHedef();
			////convert bitiş
			
		
		
		//return this.kelimeRepository.findAll();
//		return this.kelimeDal.findAll();
		return this.kelimeManager.getAll();
	}
	
	@GetMapping("/kelimes/{id}")
	public Kelime getById(@PathVariable long id) throws FileNotFoundException, IOException, ParseException {
		
		System.out.println(id);
		
		return this.kelimeManager.getById(id);
//		return null;
	}
	
	
	@PostMapping("/kelimes/add")
	public void add(@RequestBody Kelime kelime) throws FileNotFoundException, IOException, ParseException {
		
		
		this.kelimeManager.add(kelime);
//		return null;
	}

	@PostMapping("/kelimes/update")
	public void update(@RequestBody Kelime kelime) throws FileNotFoundException, IOException, ParseException {
		
		
		this.kelimeManager.update(kelime);
//		return null;
	}
	
	
	@PostMapping("/kelimes/delete")
	public void delete(@RequestBody Kelime kelime) throws FileNotFoundException, IOException, ParseException {
		
		
		this.kelimeManager.delete(kelime);
//		return null;
	}
	
	
}
