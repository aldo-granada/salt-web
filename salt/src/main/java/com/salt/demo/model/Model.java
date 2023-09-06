package com.salt.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nama;
	private String alamat;
	private String kota;
	private String provinsi;
	private Date tglRegistrasi;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getKota() {
		return kota;
	}
	public void setKota(String kota) {
		this.kota = kota;
	}
	public String getProvinsi() {
		return provinsi;
	}
	public void setProvinsi(String provinsi) {
		this.provinsi = provinsi;
	}
	public Date getTglRegistrasi() {
		return tglRegistrasi;
	}
	public void setTglRegistrasi(Date tglRegistrasi) {
		this.tglRegistrasi = tglRegistrasi;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
