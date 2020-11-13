/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author tuanpham
 */
public class PhongChieu {
    int ID_PhongChieu;
    String TenPhong;
    int SoLuongGhe;
    int ID_LoaiPhong;
    String ID_NguoiThaoTac;
    boolean isDelete;

    public int getID_PhongChieu() {
        return ID_PhongChieu;
    }

    public void setID_PhongChieu(int ID_PhongChieu) {
        this.ID_PhongChieu = ID_PhongChieu;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }

    public int getSoLuongGhe() {
        return SoLuongGhe;
    }

    public void setSoLuongGhe(int SoLuongGhe) {
        this.SoLuongGhe = SoLuongGhe;
    }

    public int getID_LoaiPhong() {
        return ID_LoaiPhong;
    }

    public void setID_LoaiPhong(int ID_LoaiPhong) {
        this.ID_LoaiPhong = ID_LoaiPhong;
    }

    public String getID_NguoiThaoTac() {
        return ID_NguoiThaoTac;
    }

    public void setID_NguoiThaoTac(String ID_NguoiThaoTac) {
        this.ID_NguoiThaoTac = ID_NguoiThaoTac;
    }

    public boolean isIsDelete() {
        return isDelete;
    }

    public void setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }

    
}
