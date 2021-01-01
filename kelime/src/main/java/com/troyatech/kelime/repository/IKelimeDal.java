package com.troyatech.kelime.repository;

import java.util.List;

import com.troyatech.kelime.model.Kelime;



public interface IKelimeDal {

	
	List<Kelime> GetAll();
	Kelime getById(int id);
	void Add(Kelime kelime);
	void Update(int id,Kelime kelime);
	void Delete(int id);
}
