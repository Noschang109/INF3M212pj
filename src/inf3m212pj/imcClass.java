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
public class imcClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float massa , peso , altura;
       String nome, status;
       
       status= " ";
       nome= " ";
       Scanner leia= new Scanner(System.in);
        System.out.print("CALCULADORA DE IMC  ");
        System.out.println("Qual seu nome: ");
        nome=leia.next();
        System.out.println("Qual sua altura : ");
        altura=leia.nextFloat();
        System.out.println("Qual seu peso : ");
        peso=leia.nextFloat();
        
        massa=peso/(altura*altura);
        if(massa <= 18.5){            
          status= "abaixo do peso";
        }else if(massa <= 24.5){
          status= "Equilibrado";
         }else if(massa<= 30.0){
          status= "Sobrepeso";
          }else if(massa<= 35.0){
          status= "Acima do peso";
           }else{
            status= "Morbidade";
            }    
        System.out.println("\n Seu nome é : " + nome);
        System.out.println("\n Sua classificação é : " + status);
        
    }    
}