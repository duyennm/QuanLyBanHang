package poly.model;

import java.util.Vector;

public class KhachHang {
    int MaKH;
    String TenKH;
    String DiaChi;
    int SDT;

    public KhachHang() {
    }

    public KhachHang(String TenKH, String DiaChi, int SDT) {
        this.TenKH = TenKH;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
    }

    public KhachHang(int MaKH, String TenKH, String DiaChi, int SDT) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }
    public Vector toVector() {
        Vector v = new Vector();
        v.add(MaKH);
        v.add(TenKH);
        v.add(DiaChi);
        v.add(SDT);
        return v;
    }
}
