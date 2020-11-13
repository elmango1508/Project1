/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.util.Date;

/**
 *
 * @author tuanpham
 */
public class LichChieu {
    int ID_LichChieu;
    Date ThoiGianBatDau;
    Date ThoiGianKetThuc;
    String TrangThai;
    int ID_Phim;
    int ID_PhongChieu;
    String ID_NguoiTao;
    boolean isDelete;

    public int getID_LichChieu() {
        return ID_LichChieu;
    }

    public void setID_LichChieu(int ID_LichChieu) {
        this.ID_LichChieu = ID_LichChieu;
    }

    public Date getThoiGianBatDau() {
        return ThoiGianBatDau;
    }

    public void setThoiGianBatDau(Date ThoiGianBatDau) {
        this.ThoiGianBatDau = ThoiGianBatDau;
    }

    public Date getThoiGianKetThuc() {
        return ThoiGianKetThuc;
    }

    public void setThoiGianKetThuc(Date ThoiGianKetThuc) {
        this.ThoiGianKetThuc = ThoiGianKetThuc;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public int getID_Phim() {
        return ID_Phim;
    }

    public void setID_Phim(int ID_Phim) {
        this.ID_Phim = ID_Phim;
    }

    public int getID_PhongChieu() {
        return ID_PhongChieu;
    }

    public void setID_PhongChieu(int ID_PhongChieu) {
        this.ID_PhongChieu = ID_PhongChieu;
    }

    public String getID_NguoiTao() {
        return ID_NguoiTao;
    }

    public void setID_NguoiTao(String ID_NguoiTao) {
        this.ID_NguoiTao = ID_NguoiTao;
    }

    public boolean isIsDelete() {
        return isDelete;
    }

    public void setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }

             

}
