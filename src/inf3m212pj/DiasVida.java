/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;
import java.util.Scanner;
/**
 *
 * @author 181910174
 */
public class DiasVida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome;
        int idade, diasVida;
              nome = "";
        System.out.println("CALC DIAS DE VIDA");
        System.out.print(" Qual seu nome:  ");
        nome = leia.next();
        System.out.print(" Qual sua idade: ");
        idade = leia.nextInt();
        diasVida = idade*365;
         System.out.print(nome + " Sua idade é : " + idade);
         System.out.print(" e ja viveu" + "("+  diasVida +")" + " Dias de vida");
         
        
              
          
    }
    
}
