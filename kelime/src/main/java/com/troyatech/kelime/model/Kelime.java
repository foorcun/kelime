package com.troyatech.kelime.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_kelime")
public class Kelime {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "ger")
	private String ger;
	@Column(name = "eng")
	private String eng;
	@Column(name = "tr")
	private String tr;
	@Column(name = "aciklama")
	private String acıklama;
	@Column(name = "puan")
	private String puan;
	
	
	
	public Kelime() {
	}

	public Kelime( String ger, String eng, String tr, String acıklama, String puan) {
		this.ger = ger;
		this.eng = eng;
		this.tr = tr;
		this.acıklama = acıklama;
		this.puan = puan;
	}
	
	
	
	
	

	public Kelime(long id, String ger, String eng, String tr, String acıklama, String puan) {
		this.id = id;
		this.ger = ger;
		this.eng = eng;
		this.tr = tr;
		this.acıklama = acıklama;
		this.puan = puan;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getPuan() {
		return puan;
	}

	public void setPuan(String puan) {
		this.puan = puan;
	}

	@Override
	public String toString() {
		return "Kelime [id=" + id + ", ger=" + ger + ", eng=" + eng + ", tr=" + tr + ", aciklama=" + acıklama
				+ ", puan=" + puan + "]";
	}
	
	
	
	
	
}
