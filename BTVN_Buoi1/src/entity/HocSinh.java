/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class HocSinh {
//    Taọ class HocSinh gồm các thuộc tính ten-String,tuoi-int,gioiTinh-boolean(true-Nam,false-Nữ),phongBan-String,soThich-String và các
//contructor, getter,s etter

    private String ten;
    private int tuoi;
    private boolean gioiTinh;
    private String phongBan;
    private String soThich;

    public HocSinh() {
    }

    public HocSinh(String ten, int tuoi, boolean gioiTinh, String phongBan, String soThich) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.phongBan = phongBan;
        this.soThich = soThich;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    public Object[] toDataRow() {
        return new Object[]{ten, tuoi, (gioiTinh ? "Male" : "Female"), phongBan, soThich};
    }

}
