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
public class LoaiPhim {
    int ID_LoaiPhim;
    String TenLoaiPhim;
    boolean isDelete;

    public int getID_LoaiPhim() {
        return ID_LoaiPhim;
    }

    public void setID_LoaiPhim(int ID_LoaiPhim) {
        this.ID_LoaiPhim = ID_LoaiPhim;
    }

    public String getTenLoaiPhim() {
        return TenLoaiPhim;
    }

    public void setTenLoaiPhim(String TenLoaiPhim) {
        this.TenLoaiPhim = TenLoaiPhim;
    }

    public boolean isIsDelete() {
        return isDelete;
    }

    public void setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }

    
}
