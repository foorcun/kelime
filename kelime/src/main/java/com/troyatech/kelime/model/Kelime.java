package com.troyatech.kelime.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Kelime {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(name = "ger")
	private String ger;
	@Column(name = "eng")
	private String eng;
	@Column(name = "tr")
	private String tr;
	@Column(name = "acıklama")
	private String acıklama;
	@Column(name = "puna")
	private int puan;
	
	
	
	public Kelime() {
	}

	public Kelime( String ger, String eng, String tr, String acıklama, int puan) {
		this.ger = ger;
		this.eng = eng;
		this.tr = tr;
		this.acıklama = acıklama;
		this.puan = puan;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGer() {
		return ger;
	}

	public void setGer(String ger) {
		this.ger = ger;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getTr() {
		return tr;
	}

	public void setTr(String tr) {
		this.tr = tr;
	}

	public String getAcıklama() {
		return acıklama;
	}

	public void setAcıklama(String acıklama) {
		this.acıklama = acıklama;
	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}
	
	
	
}
