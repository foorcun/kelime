package com.troyatech.kelime.repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
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
	

	public List<Kelime> findAll2() {
		// TODO Auto-generated method stub
		//return null;
		List<Kelime> kelimes = new ArrayList<Kelime>();
		Kelime kel = new Kelime("a","b","c","d","5");
		
		JSONParser jsonparser = new JSONParser();
		try {
			FileReader reader = new FileReader(".\\jsonFiles\\JsonKelimeler.json");
			
			Object obj = jsonparser.parse(reader);
			JSONArray keljsonobjArr = (JSONArray)obj;

//			JSONObject kelJsonObj = (JSONObject)obj;
//			kelimes.get(0).setGer((String)kelJsonObj.get("ger"));
			kelimes.add(0,kel);
			
			JSONObject benJ = (JSONObject) keljsonobjArr.get(0);
			Kelime kel2 = new Kelime((String) benJ.get("ger"),"b","c","d","5");
			kelimes.add(1,kel2);
			
			Iterator<JSONObject> iterator = keljsonobjArr.iterator(); //JSONArray, JSONObject te döndü array element olarak
			
			while(iterator.hasNext()) {
				
				
				kel2 = new Kelime( iterator.next().get("ger").toString(),"b","c","d","7");
				kelimes.add(2,kel2);
//				kelimes.add(3,(Kelime) iterator.next());
				
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return kelimes;
	}

	@Override
	public Kelime getById(int id) {
		// TODO Auto-generated method stub
		return null;
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
