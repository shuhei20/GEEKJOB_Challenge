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
public class DB11no2 extends HttpServlet {

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

            
            int number = Integer.parseInt(request.getParameter("id"));
            String nm = request.getParameter("name");
            String tl = request.getParameter("tell");
            int ag = Integer.parseInt(request.getParameter("age"));
            String bd = request.getParameter("birthday");

            out.print("更新するのは【profilesID：" + number + "】です。<br>");
            String you = (nm + "／" + tl + "／" + ag + "／" + bd);
            out.print("情報を更新<br>");

            Class.forName("com.mysql.jdbc.Driver");
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db", "root", "");

           
            if (db_con != null) {
                out.print("接続成功しました。<br>");
            }

            
            db_st = db_con.prepareStatement("update profiles set name = ?, tel = ?, age = ?, birthday = ? where profilesID = ?");
            db_st.setString(1, nm);
            db_st.setString(2, tl);
            db_st.setInt(3, ag);
            db_st.setString(4, bd);
            db_st.setInt(5, number);

            int num = db_st.executeUpdate();
            out.print("更新されたのは" + num + "人分の情報です。<br><br>");

            db_st = db_con.prepareStatement("select*from profiles");
            db_data = db_st.executeQuery();

            while (db_data.next()) {
                out.print(db_data.getInt("profilesID") + "<br>");
                out.print(db_data.getString("name") + "<br>");
                out.print(db_data.getString("tell") + "<br>");
                out.print(db_data.getInt("age") + "<br>");
                out.print(db_data.getString("birthday") + "<br>");
            }

            db_con.close();
            db_st.close();
            db_data.close();

        } catch (SQLException e_sql) {
            System.out.println("接続時にエラーが発生しました。");
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
