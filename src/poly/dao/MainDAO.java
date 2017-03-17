package poly.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import poly.model.LichSuGiaoDich;

public class MainDAO {
    
    public MainDAO() {
    }
     public List<LichSuGiaoDich> showGiaoDich(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=QuanLyBanHang";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql="select A.MAHD,C.TENKH, B.SoLuong,A.NGAYLAPHD from HOADON A, HOADON_CT B, KHACHHANG C Where A.MAHD = B.MAHD AND A.MAKH = C.MAKH Order by A.NGAYLAPHD DESC";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            List<LichSuGiaoDich> list = new ArrayList<LichSuGiaoDich>();
            while(rs.next()){
               LichSuGiaoDich sp= new LichSuGiaoDich();
               
               sp.setMaHD(rs.getInt(1));
               sp.setTenKH(rs.getString(2));
               sp.setSoLuong(rs.getInt(3));
               sp.setNgayLP(rs.getString(4));
               list.add(sp);
            }
            return list;
        }catch(Exception e){
             e.printStackTrace();
        }
        return null;
    }
}
