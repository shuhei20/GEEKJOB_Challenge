/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

/**
 *
 * @author shuhei01
 */
public class DB13no3 extends HttpServlet {

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
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");

            //「getSession」でセッションの取り出し
            HttpSession session = request.getSession();
            //「setAttribute」で初期値の設定（名前：check　値：最初のJSPで入力された名前）
            session.setAttribute("check", request.getParameter("name"));

            ServletContext context = this.getServletContext();
            RequestDispatcher dispatcher = context.getRequestDispatcher("/DB13-2.jsp");

            String s_id = request.getParameter("bango");
            String s_name = request.getParameter("syohin");
            String s_kazu = request.getParameter("kosu");
            String s_money = request.getParameter("kakaku");

            // 商品登録フォームが空文字なら、商品登録フォームへ移動（登録失敗）
            if (s_id.equals("") || s_name.equals("")
                    || s_kazu.equals("") || s_money.equals("")) {
                session.setAttribute("check", "white");
                dispatcher.forward(request, response);
            }
            // 空文字じゃないけど入力があった場合、
            // 番号・個数・価格フォームに入力されたのが数値か文字かを判断するisNumberメソッドの呼び出し
            // 数値じゃなければ、商品登録フォームへ移動（登録失敗）
            if (true != isNumber(s_id, s_kazu, s_money)) {
                session.setAttribute("check", "word");
                dispatcher.forward(request, response);
            }

            Class.forName("com.mysql.jdbc.Driver");
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db", "root", "");

            db_st = db_con.prepareStatement("insert into syohinlog(id,name,number,price)values(?,?,?,?)");
            db_st.setString(1, s_id);
            db_st.setString(2, s_name);
            db_st.setString(3, s_kazu);
            db_st.setString(4, s_money);

            db_st.executeUpdate();

            out.print("登録した情報<br>");
            out.print("番号：" + s_id + "<br>");
            out.print("商品名：" + s_name + "<br>");
            out.print("個数：" + s_kazu + "<br>");
            out.print("価格：" + s_money + "<br><br>");

            
            db_con.close();
            db_st.close();
            
        } catch (SQLException e_sql) {
            System.out.println("接続時にエラー発生：" + e_sql.getMessage());
        } catch (Exception e) {
            System.out.println("エラー発生：" + e.getMessage());
        } finally {
            try {
                db_con.close();
            } catch (SQLException e_con) {
                System.out.println("エラーが発生：" + e_con.getMessage());
            }
        }
    }

    // 引数num1,2,3を数値に変換できたらtrueを返す
    // 数値に変換できなかったらfalseを返す
    // NumberFormatExceptionは、文字通り数値のフォーマットに関する例外
    public boolean isNumber(String num1, String num2, String num3) {
        try {
            Integer.parseInt(num1);
            Integer.parseInt(num2);
            Integer.parseInt(num3);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
