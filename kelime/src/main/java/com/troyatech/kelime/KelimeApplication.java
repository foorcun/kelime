package com.troyatech.kelime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.troyatech.kelime.model.Kelime;
import com.troyatech.kelime.repository.KelimeRepository;

@SpringBootApplication
public class KelimeApplication implements CommandLineRunner {

	public static void main(String[] args)  {
		SpringApplication.run(KelimeApplication.class, args);
		
		
	}

//	@Autowired
//	private KelimeRepository kelimeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//this.kelimeRepository.save(new Kelime("ich","I","ben","","5"));
		
	}

}
