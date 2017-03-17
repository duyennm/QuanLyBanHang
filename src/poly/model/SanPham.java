package poly.model;

import java.util.Vector;

public class SanPham {
    int MaSP;
    String TenSP;
    int MaLoaiSP;
    int DonGia;
    String DonViTinh;

    public SanPham() {
    }

    public SanPham(String TenSP, int MaLoaiSP, int DonGia, String DonViTinh) {
        this.TenSP = TenSP;
        this.MaLoaiSP = MaLoaiSP;
        this.DonGia = DonGia;
        this.DonViTinh = DonViTinh;
    }

    public SanPham(int MaSP, String TenSP, int MaLoaiSP, int DonGia, String DonViTinh) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.MaLoaiSP = MaLoaiSP;
        this.DonGia = DonGia;
        this.DonViTinh = DonViTinh;
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getMaLoaiSP() {
        return MaLoaiSP;
    }

    public void setMaLoaiSP(int MaLoaiSP) {
        this.MaLoaiSP = MaLoaiSP;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public String getDonViTinh() {
        return DonViTinh;
    }

    public void setDonViTinh(String DonViTinh) {
        this.DonViTinh = DonViTinh;
    }
    public Vector toVector() {
        Vector v = new Vector();
        v.add(MaSP);
        v.add(TenSP);
        v.add(MaLoaiSP);
        v.add(DonGia);
        v.add(DonViTinh);
        return v;
    }
}
