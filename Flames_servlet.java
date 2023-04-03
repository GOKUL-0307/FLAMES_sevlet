/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Random;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
public class Flames extends HttpServlet {

   
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
            //action perform in do get
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
            
            //accept the value of html text
            String s1=request.getParameter("FNAME");
            String s2=request.getParameter("SNAME");
            s1=s1.toUpperCase();
            s2=s2.toUpperCase();
            s1=s1.replaceAll(" ","");//use to remove spaces
            s2=s2.replaceAll(" ","");//use to remove spaces
            StringBuffer sb1=new StringBuffer(s1);
            StringBuffer sb2=new StringBuffer(s2);
            Random random=new Random();
            for(int i=0;i<sb1.length();i++){
                for(int j=0;j<sb2.length();j++){
                    if(sb1.charAt(i)==sb2.charAt(j)){
                        sb1=sb1.deleteCharAt(i);
                        sb2=sb2.deleteCharAt(j);
                        i=0;
                        j=-1;
                    }
                }
            }
            int t=sb1.length()+sb2.length();
            int t1=t-1;
            String f="flames";
            for(int k=6;k>1;k--){
                int l=t1%k;
                if(l==0){
                    f=f.substring(l+1);
                }
                else{
                    f=f.substring(l+1)+f.substring(0,l);
                }
            }
            char c=f.charAt(0);
            out.println("<body bgcolor=yellow>");
            out.println("<h2 align=center>🆈🅾🆄🆁  🅵🅻🅰🅼🅴🆂  🅲🅷🅾🅸🅲🅴  🅸🆂 !!</h2>");
            out.println("<br>");
            switch(c){
                case 'f':
                    out.print("<h2 align=center>FRIEND</h2>");
                    out.println("<br>");
                    out.print("<h3 align=center> 𒀭 ✳🌠  🍰  𝒜 𝓇𝑒𝒶𝓁 𝒻𝓇𝒾𝑒𝓃𝒹 𝒾𝓈 💙𝓃𝑒 𝓌𝒽🌸 𝓌𝒶𝓁𝓀𝓈 𝒾𝓃 𝓌𝒽𝑒𝓃 𝓉𝒽𝑒 𝓇𝑒𝓈𝓉 ❤𝒻 𝓉𝒽𝑒 𝓌💙𝓇𝓁𝒹 𝓌𝒶𝓁𝓀𝓈 😍𝓊𝓉  🎀  🌠✳ ꔛ  🎀</h3>");
                    break;
                case 'l':
                    out.print("<h2 align=center>LOVE</h2>");
                    out.print("<br>");
                    out.print("<h3 align=center>💍͜ (ᵔ ̮ ᵔ)› 🍓 ⋆ 🍉  🍰  𝒟𝒶𝓇𝓀𝓃𝑒𝓈𝓈 𝒸𝒶𝓃𝓃🍪𝓉 𝒹𝓇𝒾𝓋𝑒 🍩𝓊𝓉 𝒹𝒶𝓇𝓀𝓃𝑒𝓈𝓈: 🌺𝓃𝓁𝓎 𝓁𝒾𝑔𝒽𝓉 𝒸𝒶𝓃 𝒹♡ 𝓉𝒽𝒶𝓉. 𝐻𝒶𝓉𝑒 𝒸𝒶𝓃𝓃🌺𝓉 𝒹𝓇𝒾𝓋𝑒 💍𝓊𝓉 𝒽𝒶𝓉𝑒: 🌸𝓃𝓁𝓎 𝓁❤𝓋𝑒 𝒸𝒶𝓃 𝒹🌺 𝓉𝒽𝒶𝓉.  🎀  🍉 ⋆ 🍓 💖彡 </h3>");
                    break;
                case 'a':
                    out.print("<h2 align=center>AFFECTION</h2>");
                    out.print("<br>");
                    out.print("<h3 align=center>✧❈  🎀 🌸ꗥ～ꗥ🌸 𝐀𝐟𝐟𝐞𝐜𝐭𝐢𝐨𝐧 𝐢𝐬 𝐫𝐞𝐬𝐩𝐨𝐧𝐬𝐢𝐛𝐥𝐞 𝐟𝐨𝐫 𝐧𝐢𝐧𝐞-𝐭𝐞𝐧𝐭𝐡𝐬 𝐨𝐟 𝐰𝐡𝐚𝐭𝐞𝐯𝐞𝐫 𝐬𝐨𝐥𝐢𝐝 𝐚𝐧𝐝 𝐝𝐮𝐫𝐚𝐛𝐥𝐞 𝐡𝐚𝐩𝐩𝐢𝐧𝐞𝐬𝐬 𝐭𝐡𝐞𝐫𝐞 𝐢𝐬 𝐢𝐧 𝐨𝐮𝐫 𝐧𝐚𝐭𝐮𝐫𝐚𝐥 𝐥𝐢𝐯𝐞𝐬 🌸ꗥ～ꗥ🌸 🎀  ❈✧</h3>");
                    break;
                case 'm':
                    out.print("<h2 align=center>MARRIAGE</h2>");
                     out.print("<br>");
                    out.print("<h3 align=center>✶🌟⭐ 𝕋𝕣𝕦𝕤𝕥 𝕪𝕠𝕦𝕣 𝕙𝕖𝕒𝕣𝕥 𝕚𝕗 𝕥𝕙𝕖 𝕤𝕖𝕒𝕤 𝕔𝕒𝕥𝕔𝕙 𝕗𝕚𝕣𝕖, 𝕝𝕚𝕧𝕖 𝕓𝕪 𝕝𝕠𝕧𝕖 𝕥𝕙𝕠𝕦𝕘𝕙 𝕥𝕙𝕖 𝕤𝕥𝕒𝕣𝕤 𝕨𝕒𝕝𝕜 𝕓𝕒𝕔𝕜𝕨𝕒𝕣𝕕𝕤 ⭐🌟✶ </h3>");
                    break;
                case 'e':
                    out.print("<h2 align=center>ENEMY</h2>");
                    out.print("<br>");
                    out.print("<h3 align=center> ☃️ 𝓛𝓸𝓿𝓮 𝔂𝓸𝓾𝓻 𝓮𝓷𝓮𝓶𝓲𝓮𝓼 𝓫𝓮𝓬𝓪𝓾𝓼𝓮 𝓽𝓱𝓮𝔂 𝓫𝓻𝓲𝓷𝓰 𝓸𝓾𝓽 𝓽𝓱𝓮 𝓫𝓮𝓼𝓽 𝓲𝓷 𝔂𝓸𝓾. ☃️</h3>");
                    break;
                case 's':
                    out.print("<h2 align=center>SIBLING</h2>");
                    out.print("<br>");
                    out.print("<h3 align=center>🍁🍁 𝓨𝓸𝓾 𝓭𝓸𝓷’𝓽 𝓬𝓱𝓸𝓸𝓼𝓮 𝔂𝓸𝓾𝓻 𝓯𝓪𝓶𝓲𝓵𝔂. 𝓣𝓱𝓮𝔂 𝓪𝓻𝓮 𝓖𝓸𝓭’𝓼 𝓰𝓲𝓯𝓽 𝓽𝓸 𝔂𝓸𝓾, 𝓪𝓼 𝔂𝓸𝓾 𝓪𝓻𝓮 𝓽𝓸 𝓽𝓱𝓮𝓶 🍁🍁</h3>");
                    break;
            }
            out.print("</body>");
              
    }
}
