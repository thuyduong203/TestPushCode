/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class GiangVien {
//    Tạo Class GiangVien bao gồm các thuộc tính Thuộc tính: maNV – String, ten – String, tuoi-int, bacGiangVien-String, loaiGiangVien-String ,
//gioiTinh-boolean(true-Nam,false-Nu)và contructor, getter, setter

    private String maGV;
    private String tenGV;
    private int tuoi;
    private String bacGV;
    private String loaiGV;
    private boolean gioiTinh;

    public GiangVien() {
    }

    public GiangVien(String maGV, String tenGV, int tuoi, String bacGV, String loaiGV, boolean gioiTinh) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.tuoi = tuoi;
        this.bacGV = bacGV;
        this.loaiGV = loaiGV;
        this.gioiTinh = gioiTinh;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getBacGV() {
        return bacGV;
    }

    public void setBacGV(String bacGV) {
        this.bacGV = bacGV;
    }

    public String getLoaiGV() {
        return loaiGV;
    }

    public void setLoaiGV(String loaiGV) {
        this.loaiGV = loaiGV;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Object[] toDataRow() {
        return new Object[]{maGV, tenGV, tuoi, bacGV, (gioiTinh ? "Nam" : "Nữ")};
    }
}
