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
public class DB9no2 extends HttpServlet {

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

            
            String you = (number + "／" + nm + "／" + tl + "／" + ag + "／" + bd);
            if (you != null) {
                out.print("以下の内容を登録<br>");
            }

            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db", "root", "");
            if (db_con != null) {
                out.print("接続成功しました。");
            }

            db_st = db_con.prepareStatement("insert into profiles values(?, ?, ?, ?, ?)");

            
            
            db_st.setInt(1, number);
            db_st.setString(2, nm);
            db_st.setString(3, tl);
            db_st.setInt(4, ag);
            db_st.setString(5, bd);

            
            int num = db_st.executeUpdate();
            out.print("今回の登録は" + num + "人分の情報です<br>");

            
            
            db_st = db_con.prepareStatement("select*from profiles");
            db_data = db_st.executeQuery();

            
            while (db_data.next()) {
                out.print("登録されている情報<br>");
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
            System.out.println(e_sql.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                db_con.close();
            } catch (SQLException e_con) {
                System.out.println(e_con.getMessage());
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
