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
public class DanhSachPhong {
    int ID_LoaiPhong;
    String TenLoaiPhong;
    boolean isDelete;

    public int getID_LoaiPhong() {
        return ID_LoaiPhong;
    }

    public void setID_LoaiPhong(int ID_LoaiPhong) {
        this.ID_LoaiPhong = ID_LoaiPhong;
    }

    public String getTenLoaiPhong() {
        return TenLoaiPhong;
    }

    public void setTenLoaiPhong(String TenLoaiPhong) {
        this.TenLoaiPhong = TenLoaiPhong;
    }

    public boolean isIsDelete() {
        return isDelete;
    }

    public void setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }

    
}
