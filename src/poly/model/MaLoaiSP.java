package poly.model;

public class MaLoaiSP {
    int MaLoaiSP;
    String TenLoaiSP;

    public MaLoaiSP() {
    }

    public MaLoaiSP(int MaLoaiSP, String TenLoaiSP) {
        this.MaLoaiSP = MaLoaiSP;
        this.TenLoaiSP = TenLoaiSP;
    }

    public int getMaLoaiSP() {
        return MaLoaiSP;
    }

    public void setMaLoaiSP(int MaLoaiSP) {
        this.MaLoaiSP = MaLoaiSP;
    }

    public String getTenLoaiSP() {
        return TenLoaiSP;
    }

    public void setTenLoaiSP(String TenLoaiSP) {
        this.TenLoaiSP = TenLoaiSP;
    }
    
}
