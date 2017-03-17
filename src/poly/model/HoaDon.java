package poly.model;

import java.util.Vector;

public class HoaDon {
    int MaHD;
    String NgayLP;
    int MaKH;
    public HoaDon() {
    }

    public HoaDon(String NgayLP, int MaKH) {
        this.NgayLP = NgayLP;
        this.MaKH = MaKH;
    }

    public HoaDon(int MaHD, String NgayLP, int MaKH) {
        this.MaHD = MaHD;
        this.NgayLP = NgayLP;
        this.MaKH = MaKH;
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

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }
     public Vector toVector() {
        Vector v = new Vector();
        v.add(MaHD);
        v.add(MaKH);
        v.add(NgayLP);
        return v;
    }
}
