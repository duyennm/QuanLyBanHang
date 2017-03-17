package poly.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import poly.model.HoaDon;

public class HoaDonDAO {

    public HoaDonDAO() {
    }
    public List<HoaDon> showHonDon(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=QuanLyBanHang";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql="select * from HoaDon";
            //String sql="select HD.MAHD, KH.TENKH, HD.NGAYLAPHD from HOADON HD,KHACHHANG KH Where HD.MAKH = KH.MAKH";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            List<HoaDon> list = new ArrayList<HoaDon>();
            while(rs.next()){

               HoaDon hd= new HoaDon();
               hd.setMaHD(rs.getInt(1));
               hd.setNgayLP(rs.getString(2));
               hd.setMaKH(rs.getInt(3));
               list.add(hd);
            }
            return list;
        }catch(Exception e){
             e.printStackTrace();
        }
        return null;
    } 
      public int insert(HoaDon hd) {
        int r = 1;
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=QuanLyBanHang";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql = "insert into HoaDon values(?,?)";
            PreparedStatement stm= con.prepareStatement(sql);
            stm.setString(1, hd.getNgayLP());
            stm.setInt(2, hd.getMaKH());
            stm.executeUpdate();
            stm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            r = 0;
        }
        return r;
    }
       public int delete(int mahd){
           int r = 1;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=QuanLyBanHang";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql="delete from HoaDon where MAHD=?";
            PreparedStatement stm= con.prepareStatement(sql);
            stm.setInt(1, mahd);
            stm.executeUpdate();
            stm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            r = 0;
        }
        return r;
    }
       public int update(HoaDon hd) {
        int r = 1;
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=QuanLyBanHang";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql = "update HoaDon set NGAYLAPHD=?, MAKH=? where MAHD=?";
            PreparedStatement stm= con.prepareStatement(sql);
            stm.setString(1, hd.getNgayLP());
            stm.setInt(2, hd.getMaKH());
            stm.setInt(3, hd.getMaHD());
            stm.executeUpdate();
            stm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            r = 0;
        }
        return r;
    }
}
