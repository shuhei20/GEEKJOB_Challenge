/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author shuhei01
 */
public class DB12no2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    Connection db_con = null;
    PreparedStatement db_st = null;
    ResultSet db_data = null;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            request.setCharacterEncoding("UTF-8");

            
            String nm = request.getParameter("name");
            String ag = request.getParameter("age");
            String bd = request.getParameter("birthday");

            String you = (nm + "／" + ag + "／" + bd);
            out.print("下記の内容で検索<br>");

            if (nm.equals("") && ag.equals("") && bd.equals("")) {
                out.print("前の画面に戻り、検索したい内容を入力してください");
                return;
            }else{
                out.print("検索を開始<br>");
            }
            
            Class.forName("com.mysql.jdbc.Driver");
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db", "root", "");

            if (db_con != null) {
                out.print("接続成功しました。<br>");
            }

            
            db_st = db_con.prepareStatement("select*from profiles where name like ? and age like ? and birthday like ?");
            db_st.setString(1, "%" + nm + "%");
            db_st.setString(2, "%" + ag + "%");
            db_st.setString(3, "%" + bd + "%");

            db_data = db_st.executeQuery();

            boolean tf = false;

            while (db_data.next()) {
                out.print("探している情報<br>");
                out.print(db_data.getInt("profilesID") + "<br>");
                out.print(db_data.getString("name") + "<br>");
                out.print(db_data.getString("tell") + "<br>");
                out.print(db_data.getInt("age") + "<br>");
                out.print(db_data.getString("birthday") + "<br>");
                tf = true;
            }
            if (tf == false) {
                out.print("探している情報は見つかりませんでした。");
            }

            db_con.close();
            db_st.close();
            db_data.close();

        } catch (SQLException e_sql) {
            System.out.println(e_sql.getMessage());
        } catch (Exception e) {
            System.out.println("エラーが発生しました。");
        } finally {
            try {
                db_con.close();
            } catch (SQLException e_con) {
                System.out.println(e_con.getMessage());
            }
        }
    }
}
