/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import entity.GiangVien;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IGiangVien {

    void update(List<GiangVien> listGV, int index, GiangVien gv);

    void delete(List<GiangVien> ListGV, int index);

    void sapXep(List<GiangVien> listGV);

    List timKiem(List<GiangVien> listGV, String ten);
}
