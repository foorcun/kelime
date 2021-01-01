package com.troyatech.kelime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.troyatech.kelime.model.Kelime;
import com.troyatech.kelime.repository.KelimeRepository;

@RestController
@RequestMapping("api/")
public class KelimeController {
	
	@Autowired
	private KelimeRepository kelimeRepository;
	
	@GetMapping("kelimes")
	public List<Kelime> getKelimes(){
		
		
		return this.kelimeRepository.findAll();
	}

}
