package com.programming.nhatanh.lesson6.Testing_System_Assignment_4_Debug.src.entity;


public class NhanVien extends CanBo {

	private String congViec;

	public NhanVien(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi, String congViec) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.congViec = congViec;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

}
