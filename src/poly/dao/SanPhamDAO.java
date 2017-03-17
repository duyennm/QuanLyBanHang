package poly.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import poly.model.SanPham;

public class SanPhamDAO {

    public SanPhamDAO() {
    }
    public List<SanPham> showSanPham(String tensp){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=QuanLyBanHang";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql="select * from SanPham";
            if(tensp.length()>0){
                sql += " where TENSP like '%"+tensp+"%'";
            }
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            List<SanPham> list = new ArrayList<SanPham>();
            while(rs.next()){

               SanPham sp= new SanPham();
               sp.setTenSP(rs.getString(1));
               sp.setDonGia(rs.getInt(2));
               sp.setMaLoaiSP(rs.getInt(3));
               sp.setDonViTinh(rs.getString(4));
               sp.setMaSP(rs.getInt(5));
               list.add(sp);
            }
            return list;
        }catch(Exception e){
             e.printStackTrace();
        }
        return null;
    } 
      public int insert(SanPham sp) {
        int r = 1;
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=QuanLyBanHang";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql = "insert into SanPham values(?,?,?,?)";
            PreparedStatement stm= con.prepareStatement(sql);
            stm.setString(1, sp.getTenSP());
            stm.setInt(2, sp.getDonGia());
            stm.setInt(3, sp.getMaLoaiSP());
            stm.setString(4, sp.getDonViTinh());
            stm.executeUpdate();
            stm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            r = 0;
        }
        return r;
    }
       public int delete(int masp){
           int r = 1;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=QuanLyBanHang";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql="delete from SanPham where MASP=?";
            PreparedStatement stm= con.prepareStatement(sql);
            stm.setInt(1, masp);
            stm.executeUpdate();
            stm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            r = 0;
        }
        return r;
    }
       public int update(SanPham sp) {
        int r = 1;
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=QuanLyBanHang";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql = "update SanPham set TENSP=?, DONGIA=?, MALOAISP=?, DONVI=? where MASP=?";
            PreparedStatement stm= con.prepareStatement(sql);
            stm.setString(1, sp.getTenSP());
            stm.setInt(2, sp.getDonGia());
            stm.setInt(3, sp.getMaLoaiSP());
            stm.setString(4, sp.getDonViTinh());
            stm.setInt(5, sp.getMaSP());
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
