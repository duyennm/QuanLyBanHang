package poly.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import poly.model.HoaDonCT;

public class HoaDonCTDAO {

    public HoaDonCTDAO() {
    }
    public int insert(HoaDonCT hdct) {
        int r = 1;
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=QuanLyBanHang";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql = "insert into HoaDon_CT (MaHD,MaSP,SoLuong) values(IDENT_CURRENT( 'HoaDon' ),?,?)";
            PreparedStatement stm= con.prepareStatement(sql);
            
            stm.setInt(1, hdct.getMaSP());
            stm.setInt(2, hdct.getSoLuong());
            stm.executeUpdate();
            stm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            r = 0;
        }
        return r;
    }
    
    public List<HoaDonCT> showHonDonCT(int mahd){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=QuanLyBanHang";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql="select * from HOADON_CT where MAHD="+mahd+"";
            //String sql="select HD.MAHD, KH.TENKH, HD.NGAYLAPHD from HOADON HD,KHACHHANG KH Where HD.MAKH = KH.MAKH";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            List<HoaDonCT> list = new ArrayList<HoaDonCT>();
            while(rs.next()){
               HoaDonCT hdct= new HoaDonCT();
               hdct.setMaHD(rs.getInt(1));
               hdct.setMaSP(rs.getInt(2));
               hdct.setSoLuong(rs.getInt(3));
               list.add(hdct);
            }
            return list;
        }catch(Exception e){
             e.printStackTrace();
        }
        return null;
    } 
}
