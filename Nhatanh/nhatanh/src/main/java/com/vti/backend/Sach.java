package com.vti.backend;

public class Sach extends TaiLieu{

    private String author;
    private int pageNum;

    public Sach(String maTaiLieu, String nhaXuatBan, int soBan, String author, int pageNum) {
        super(maTaiLieu, nhaXuatBan, soBan);
        this.author = author;
        this.pageNum = pageNum;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maTaiLieu='" + super.getMaTaiLieu() + '\'' +
                ", nhaXuatBan='" + super.getNhaXuatBan() + '\'' +
                ", soBan=" + super.getSoBan() +
                ", author='" + author + '\'' +
                ", pageNum=" + pageNum +
                '}';
    }
}
