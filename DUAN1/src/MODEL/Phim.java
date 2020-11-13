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
public class Phim {

    int ID_Phim;
    String TenPhim;
    String DaoDien;
    Date NgayPhatHanh;
    String QuocGia;
    String Poster;
    Date NgayBatDauCongChieu;
    Date NgayKetThucCongChieu;
    Date NgayCapNhat;
    int ThoiLuong;
    int SoLuongXuatChieu;
    String MoTaNgan;
    String TrangThai;
    int ID_LoaiPhim;
    String NguoiTao;
    boolean isDelete;

    public int getID_Phim() {
        return ID_Phim;
    }

    public void setID_Phim(int ID_Phim) {
        this.ID_Phim = ID_Phim;
    }

    public String getTenPhim() {
        return TenPhim;
    }

    public void setTenPhim(String TenPhim) {
        this.TenPhim = TenPhim;
    }

    public String getDaoDien() {
        return DaoDien;
    }

    public void setDaoDien(String DaoDien) {
        this.DaoDien = DaoDien;
    }

    public Date getNgayPhatHanh() {
        return NgayPhatHanh;
    }

    public void setNgayPhatHanh(Date NgayPhatHanh) {
        this.NgayPhatHanh = NgayPhatHanh;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String QuocGia) {
        this.QuocGia = QuocGia;
    }

    public String getPoster() {
        return Poster;
    }

    public void setPoster(String Poster) {
        this.Poster = Poster;
    }

    public Date getNgayBatDauCongChieu() {
        return NgayBatDauCongChieu;
    }

    public void setNgayBatDauCongChieu(Date NgayBatDauCongChieu) {
        this.NgayBatDauCongChieu = NgayBatDauCongChieu;
    }

    public Date getNgayKetThucCongChieu() {
        return NgayKetThucCongChieu;
    }

    public void setNgayKetThucCongChieu(Date NgayKetThucCongChieu) {
        this.NgayKetThucCongChieu = NgayKetThucCongChieu;
    }

    public Date getNgayCapNhat() {
        return NgayCapNhat;
    }

    public void setNgayCapNhat(Date NgayCapNhat) {
        this.NgayCapNhat = NgayCapNhat;
    }

    public int getThoiLuong() {
        return ThoiLuong;
    }

    public void setThoiLuong(int ThoiLuong) {
        this.ThoiLuong = ThoiLuong;
    }

    public int getSoLuongXuatChieu() {
        return SoLuongXuatChieu;
    }

    public void setSoLuongXuatChieu(int SoLuongXuatChieu) {
        this.SoLuongXuatChieu = SoLuongXuatChieu;
    }

    public String getMoTaNgan() {
        return MoTaNgan;
    }

    public void setMoTaNgan(String MoTaNgan) {
        this.MoTaNgan = MoTaNgan;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public int getID_LoaiPhim() {
        return ID_LoaiPhim;
    }

    public void setID_LoaiPhim(int ID_LoaiPhim) {
        this.ID_LoaiPhim = ID_LoaiPhim;
    }

    public String getNguoiTao() {
        return NguoiTao;
    }

    public void setNguoiTao(String NguoiTao) {
        this.NguoiTao = NguoiTao;
    }

    public boolean isIsDelete() {
        return isDelete;
    }

    public void setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }

    
}
