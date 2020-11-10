create database cinema;
use cinema;

-- tao table NhanVien
create table NhanVien(
	ID_NhanVien varchar(5) PRIMARY KEY,
	HoTen nvarchar(30),
	Username varchar(30),
	Passwords varchar(30),
	GioiTinh bit,
	DiaChi nvarchar(255),
	Email varchar(50),
	Sdt varchar(11),
	Luong float,
	ChucVu nvarchar(50),
	TrangThai nvarchar(50),
	isDelete bit default 0
);

-- Tao table LoaiPhim
create table LoaiPhim(
	ID_LoaiPhim int IDENTITY(1,1) PRIMARY KEY,
	TenLoaiPhim nvarchar(50),
	isDelete bit default 0
);

-- Tao table Phim
create table Phim(
	ID_Phim int IDENTITY(1,1) PRIMARY KEY,
	TenPhim nvarchar(50),
	DaoDien nvarchar(50),
	NgayPhatHanh date,
	QuocGia nvarchar(50),
	Poster nvarchar(50),
	NgayBatDauCongChieu date,
	NgayKetThucCongChieu date,
	NgayCapNhat date,
	ThoiLuong int,
	SoLuongXuatChieu int,
	MoTaNgan ntext,
	TrangThai nvarchar(50),
	ID_LoaiPhim int,
	NguoiTao varchar(5),
	isDelete bit default 0
);

-- Tao table DanhSachPhong
create table DanhSachPhong(
	ID_LoaiPhong int IDENTITY (1,1) PRIMARY KEY,
	TenLoaiPhong nvarchar(30),
	isDelete bit default 0
);
--Tao table PhongChieu
create table PhongChieu(
	ID_PhongChieu int IDENTITY(1,1) PRIMARY KEY,
	TenPhong nvarchar(50),
	SoLuongGhe int,
	ID_LoaiPhong int,
	ID_NguoiThaoTac varchar(5),
	isDelete bit default 0
);

--Tao table LichChieu
create table LichChieu(
	ID_LichChieu int IDENTITY(1,1) PRIMARY KEY,
	ThoiGianBatDau date,
	ThoiGianKetThuc date,
	TrangThai nvarchar(50),
	ID_Phim int,
	ID_PhongChieu int,
	ID_NguoiTao varchar(5),
	isDelete bit default 0
);

-- Tao table NhatKyChieuPhim
create table NhatKiChieuPhim(
	ID_NhatKiChieuPhim int IDENTITY(1,1) PRIMARY KEY ,
	SoLuongKhach int,
	DoanhThu float,
	ThoiGianCapNhat date,
	ID_LichChieuPhim int  UNIQUE,
	isDelete bit default 0
);
--tao khoa ngoai cho table phim
alter table Phim
ADD CONSTRAINT fk_Phim_LoaiPhim FOREIGN KEY (ID_LoaiPhim) REFERENCES LoaiPhim(ID_LoaiPhim)

alter table Phim
ADD CONSTRAINT fk_Phim_NhanVien FOREIGN KEY (NguoiTao) REFERENCES NhanVien(ID_NhanVien)

-- Tao khoa ngoai table phong chieu
alter table PhongChieu
ADD CONSTRAINT fk_PhongChieu_NhanVien FOREIGN KEY (ID_NguoiThaoTac) REFERENCES NhanVien(ID_NhanVien)

-- Tao khoa ngoai table phong chieu
alter table PhongChieu
ADD CONSTRAINT fk_PhongChieu_DanhSachPhong FOREIGN KEY (ID_LoaiPhong) REFERENCES DanhSachPhong(ID_LoaiPhong)
-- tao khoa ngoai table LichChieu
alter table LichChieu
ADD CONSTRAINT fk_LichChieu_Phim FOREIGN KEY (ID_Phim) REFERENCES Phim(ID_Phim)



alter table LichChieu
ADD CONSTRAINT fk_LichChieu_NhanVien FOREIGN KEY (ID_NguoiTao) REFERENCES NhanVien(ID_NhanVien)



alter table LichChieu
ADD CONSTRAINT fk_LichChieu_PhongChieu FOREIGN KEY (ID_PhongChieu) REFERENCES PhongChieu(ID_PhongChieu)

alter table NhatKiChieuPhim
ADD CONSTRAINT fk_LichChieu_NhatKiChieuPhim FOREIGN KEY (ID_LichChieuPhim) REFERENCES LichChieu(ID_LichChieu)