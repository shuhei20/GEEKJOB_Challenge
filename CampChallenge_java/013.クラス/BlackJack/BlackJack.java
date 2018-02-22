/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shuhei01
 */
public class BlackJack extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BlackJack</title>");            
            out.println("</head>");
            out.println("<body>");
            
            //DealerとUserをインスタンス化
            Dealer D = new Dealer();
            User U = new User();
            
            //DealerとUserに２枚ずつカードを配る
            D.setCard(D.Deal());
            U.setCard(D.Deal());
            
            //カードの合計が21になるまでカードを配る
            //Dealer
            while(D.checkSum() == true) {
                D.setCard(D.Hit());
                break;
            }
            
            //User
            while(U.checkSum() == true) {
                U.setCard(D.Hit());
                break;
            }
            
            
            //勝負
            
            //Dealerのカードの変化と最終結果
            out.print("Dealerの手持ちカード");
            
            for(int x=0; x<D.myCards.size(); x++) {
            out.println(U.myCards.get(x));
            }
            
            out.println("Dealerのカードの合計" + D.open() + "<br>");
            
            //Userのカードの変化と最終結果
            out.print("Userの手持ちカード");
            
            for(int y=0; y<U.myCards.size(); y++) {
                out.println(U.myCards.get(y));
            }
            
            out.println("Userのカードの合計" + U.open() + "<br>");
            
            
            
            //勝敗
            if(D.open()<21 && U.open()<21) {
                out.print("Bust!引き分け");
                
            }else if(U.open()>21){
                out.print("Bust!Dealerの勝利");
                
            }else if(D.open()>21){
                out.print("Bust!Userの勝利");
                
            }else if(U.open() < D.open()){
                out.println("Dealerの勝利");
                
            }else if(U.open() > D.open()){
                out.println("Userの勝利");
                
            }else{
                out.print("引き分け");
            }
            
            
            out.println("</body>");
            out.println("</html>"); 
            
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
