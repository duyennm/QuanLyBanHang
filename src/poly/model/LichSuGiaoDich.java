package poly.model;

import java.util.Vector;

public class LichSuGiaoDich {
    int MaHD;
    String NgayLP;
    String TenKH;
    int SoLuong;

    public LichSuGiaoDich() {
    }

    public LichSuGiaoDich(int MaHD, String NgayLP, String MaKH, int SoLuong) {
        this.MaHD = MaHD;
        this.NgayLP = NgayLP;
        this.TenKH = MaKH;
        this.SoLuong = SoLuong;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public String getNgayLP() {
        return NgayLP;
    }

    public void setNgayLP(String NgayLP) {
        this.NgayLP = NgayLP;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String MaKH) {
        this.TenKH = MaKH;
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
        v.add(TenKH);
        v.add(SoLuong);
        v.add(NgayLP);
        return v;
    }
}
