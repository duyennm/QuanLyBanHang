package poly.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import poly.model.KhachHang;

public class KhachHangDAO {

    public KhachHangDAO() {
    }
   public List<KhachHang> showKhachHang(String tenkh){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=QuanLyBanHang";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql="select * from KhachHang";
            if(tenkh.length()>0){
                sql += " where TENKH like '%"+tenkh+"%'";
            }
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            List<KhachHang> list = new ArrayList<KhachHang>();
            while(rs.next()){

               KhachHang kh= new KhachHang();
               kh.setMaKH(rs.getInt(1));
               kh.setTenKH(rs.getString(2));
               kh.setDiaChi(rs.getString(3));
               kh.setSDT(rs.getInt(4));
               list.add(kh);
            }
            return list;
        }catch(Exception e){
             e.printStackTrace();
        }
        return null;
    } 
      public int insert(KhachHang kh) {
        int r = 1;
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=QuanLyBanHang";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql = "insert into KhachHang values(?,?,?)";
            PreparedStatement stm= con.prepareStatement(sql);
            stm.setString(1, kh.getTenKH());
            stm.setString(2, kh.getDiaChi());
            stm.setInt(3, kh.getSDT());
            stm.executeUpdate();
            stm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            r = 0;
        }
        return r;
    }
       public int delete(int makh){
           int r = 1;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=QuanLyBanHang";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql="delete from KhachHang where MAKH=?";
            PreparedStatement stm= con.prepareStatement(sql);
            stm.setInt(1, makh);
            stm.executeUpdate();
            stm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            r = 0;
        }
        return r;
    }
       public int update(KhachHang kh) {
        int r = 1;
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=QuanLyBanHang";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql = "update KhachHang set TENKH=?, DIACHI=?, SDT=? where MaKH=?";
            PreparedStatement stm= con.prepareStatement(sql);
            stm.setString(1, kh.getTenKH());
            stm.setString(2, kh.getDiaChi());
            stm.setInt(3, kh.getSDT());
            stm.setInt(4, kh.getMaKH());
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
