package com.troyatech.kelime.converter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;

import com.troyatech.kelime.Business.IKelimeService;
import com.troyatech.kelime.DataAccess.IKelimeDal;
import com.troyatech.kelime.DataAccess.JsonKelimeDal;
import com.troyatech.kelime.model.Kelime;

public class ConverterFromJson {

//	input
	private IKelimeDal jsonVeren = new  JsonKelimeDal();
	
//	output
	
	private IKelimeService veriAlanManager;

	
	
	public ConverterFromJson(IKelimeService veriAlanManager) {
		this.veriAlanManager = veriAlanManager;
}



	
	public void convertToHedef() throws FileNotFoundException, IOException, ParseException {
		
		List<Kelime> alinanE = jsonVeren.getAll();
		
		for(int i=0; i<alinanE.size();i++ ) {
			
			try {
				  //  Block of code to try
				this.veriAlanManager.add(alinanE.get(i));
				}
				catch(Exception e) {
				  //  Block of code to handle errors
				}
			
		}
		
		
	};
	
	
	
}
