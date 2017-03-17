package poly.model;

import java.util.Vector;

public class HoaDonCT {
    int MaHD;
    int MaSP;
    int SoLuong;

    public HoaDonCT() {
    }

    public HoaDonCT(int MaSP, int SoLuong) {
        this.MaSP = MaSP;
        this.SoLuong = SoLuong;
    }

    public HoaDonCT(int MaHD, int MaSP, int SoLuong) {
        this.MaHD = MaHD;
        this.MaSP = MaSP;
        this.SoLuong = SoLuong;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int MaSP) {
        this.MaSP = MaSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    public Vector toVector() {
        Vector v = new Vector();
        v.add(MaHD);
        v.add(MaSP);
        v.add(SoLuong);
        return v;
    }
}
