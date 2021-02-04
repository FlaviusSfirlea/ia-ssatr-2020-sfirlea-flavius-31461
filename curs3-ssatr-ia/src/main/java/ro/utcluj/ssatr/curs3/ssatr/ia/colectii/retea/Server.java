/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.utcluj.ssatr.curs3.ssatr.ia.colectii.retea;


import java.net.*;
import java.io.*;
import java.time.Instant;
import java.util.StringTokenizer;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss =new ServerSocket(4050);
        
        while(true){
            System.out.println("Astept conexiune de la client...");
            Socket s = ss.accept(); //metoda blocanta
            System.out.println("Clientul s-a conectat!");
            //...... 
            BufferedReader fluxIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter fluxOut = new PrintWriter(new OutputStreamWriter(s.getOutputStream()),true);
            //......
            String line = "";
            while(!line.equals("close connection")){
                ///in
                line = fluxIn.readLine();
                System.out.println("Am primti de la client: "+line);
                
                String[] operators = new String[] {"+","-","*","/"};
                String operator = "";
                
                for (int i=0;i < operators.length; i++ )
                {
                operator = line.substring(line.indexOf(operators[i]), line.indexOf(operators[i]) + 1);
                }
                StringTokenizer st = new StringTokenizer(line,operator);
                int op1 = Integer.parseInt(st.nextToken().trim());
                int op2 = Integer.parseInt(st.nextToken().trim());
                
                int rez = 0;
                switch(operator){
                    case "+": 
                        rez = op1 + op2;
                        break;
                    case "-":
                        rez = op1 - op2;
                        break;
                     case "*":
                        rez = op1 * op2;
                        break;
                     case "/":
                        rez = op1 / op2;
                        break;
                }
                //out
                line = "The result of the calculation is "+rez;
                fluxOut.println(line);
            }

            s.close();
        }
    }
}
