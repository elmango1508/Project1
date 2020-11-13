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
public class NhatKiChieuPhim {

    int ID_NhatKiChieuPhim;
    int SoLuongKhach;
    float DoanhThu;
    Date ThoiGianCapNhat;
    int ID_LichChieuPhim;
    boolean isDelete;

    public int getID_NhatKiChieuPhim() {
        return ID_NhatKiChieuPhim;
    }

    public void setID_NhatKiChieuPhim(int ID_NhatKiChieuPhim) {
        this.ID_NhatKiChieuPhim = ID_NhatKiChieuPhim;
    }

    public int getSoLuongKhach() {
        return SoLuongKhach;
    }

    public void setSoLuongKhach(int SoLuongKhach) {
        this.SoLuongKhach = SoLuongKhach;
    }

    public float getDoanhThu() {
        return DoanhThu;
    }

    public void setDoanhThu(float DoanhThu) {
        this.DoanhThu = DoanhThu;
    }

    public Date getThoiGianCapNhat() {
        return ThoiGianCapNhat;
    }

    public void setThoiGianCapNhat(Date ThoiGianCapNhat) {
        this.ThoiGianCapNhat = ThoiGianCapNhat;
    }

    public int getID_LichChieuPhim() {
        return ID_LichChieuPhim;
    }

    public void setID_LichChieuPhim(int ID_LichChieuPhim) {
        this.ID_LichChieuPhim = ID_LichChieuPhim;
    }

    public boolean isIsDelete() {
        return isDelete;
    }

    public void setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }

    
}
