package com.troyatech.kelime.repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.troyatech.kelime.model.Kelime;

@Repository
public class JsonKelimeRepositoryDal implements IKelimeDal{

	
	
	
	@Autowired
	public JsonKelimeRepositoryDal() {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public List<Kelime> findAll() throws IOException, ParseException {
		// TODO Auto-generated method stub
		//link: https://www.youtube.com/watch?v=_vdiWUDbruw&ab_channel=BrandanJones
		
		// kelime list
		List<Kelime> kelimes = new ArrayList<Kelime>();

		//raw json
		//FileReader reader = new FileReader(".\\jsonFiles\\JsonKelimeler.json");
		FileReader reader = new FileReader(".\\jsonFiles\\kelimelerim.json");
		//json array
		JSONParser jsonparser = new JSONParser();
		Object obj = jsonparser.parse(reader);
		JSONArray keljsonobjArr = (JSONArray)obj;
		//for
		
		for(int i = 0; i<  keljsonobjArr.size(); i++) {
		
		//jsonObject
		JSONObject jsonKelime =  (JSONObject) keljsonobjArr.get(i);
		// klasımız
		Kelime kelime = new Kelime();		
		//data get id,.....
		String id = (String) jsonKelime.get("id");
		String ger = (String) jsonKelime.get("ger");
		String eng = (String) jsonKelime.get("eng");
		String tr = (String) jsonKelime.get("tr");
		String acıklama = (String) jsonKelime.get("acıklama");
		String puan = (String) jsonKelime.get("puan");
		
		//data set id,....
		kelime.setId(id);
		kelime.setGer(ger);
		kelime.setEng(eng);
		kelime.setTr(tr);
		kelime.setAcıklama(acıklama);
		kelime.setPuan(puan);
		
		
		
		//kelime listesine add
		kelimes.add(kelime);
		}
		
		return kelimes;
	}
	


	@Override
	public Kelime getById(String id) throws IOException, ParseException {
		// TODO Auto-generated method stub
		
		// kelime list
		List<Kelime> kelimes = new ArrayList<Kelime>();
		
		//raw json
		//FileReader reader = new FileReader(".\\jsonFiles\\JsonKelimeler.json");
		FileReader reader = new FileReader(".\\jsonFiles\\kelimelerim.json");
		
		//json array
		JSONParser jsonparser = new JSONParser();
		Object obj = jsonparser.parse(reader);
		JSONArray keljsonobjArr = (JSONArray)obj;
		
		//jsonObject
		JSONObject jsonKelime =  (JSONObject) keljsonobjArr.get(Integer.parseInt(id)-1);
		// klasımız
		Kelime kelime = new Kelime();
		
		//data get id,.....
				String idK = (String) jsonKelime.get("id");
				String ger = (String) jsonKelime.get("ger");
				String eng = (String) jsonKelime.get("eng");
				String tr = (String) jsonKelime.get("tr");
				String acıklama = (String) jsonKelime.get("acıklama");
				String puan = (String) jsonKelime.get("puan");
				
				//data set idK,....
				kelime.setId(idK);
				kelime.setGer(ger);
				kelime.setEng(eng);
				kelime.setTr(tr);
				kelime.setAcıklama(acıklama);
				kelime.setPuan(puan);
				
//		Kelime k = new Kelime("2","a","b","c","d","4");
//		Kelime k = new Kelime("2","a","b","c","d");
		return kelime;
//		return null;
	}

	@Override
	public void Add(Kelime kelime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update(int id, Kelime kelime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		
	}





}
