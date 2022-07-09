/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import entity.GiangVien;
import java.util.ArrayList;
import java.util.List;
import service.IGiangVien;

/**
 *
 * @author Admin
 */
public class GiangVienService implements IGiangVien {

    @Override
    public void update(List<GiangVien> listGV, int index, GiangVien gv) {
        for (int i = 0; i < listGV.size(); i++) {
            if (i == index) {
                listGV.set(index, gv);
            }
        }
    }

    @Override
    public void delete(List<GiangVien> ListGV, int index) {
        ListGV.remove(index);
    }

    @Override
    public void sapXep(List<GiangVien> listGV) {
        listGV.sort((gv1, gv2) -> {
            if (gv1.getTenGV().equals(gv2.getTenGV())) {
                return gv2.getTuoi() - gv1.getTuoi();
            } else {
                return gv1.getTenGV().compareTo(gv2.getTenGV());
            }
        });
    }

    @Override
    public List timKiem(List<GiangVien> listGV, String ten) {
        List<GiangVien> listFind = new ArrayList<>();
        for (int i = 0; i < listGV.size(); i++) {
            if (listGV.get(i).getTenGV().contains(ten)) {
                listFind.add(listGV.get(i));
            }
        }
        return listFind;
    }

}
