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
public class NOTASESCOLARESVETOR {

    
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        System.out.println("Notas escolares");
        System.out.print("Qual notas a inserir? ");
        int nNotas = (int) leiaFloat();
        
        float notas[] = new float[nNotas+1];  
        
        for (int i = 0; i < nNotas; i++) {
            do{
            System.out.print("Informe a "+ (i+1) + "°a nota: ");
               notas[i] = leiaFloat();
               if(validaNota(notas[i])){//significa ou
            System.out.println("nota invalida, tente novamente. ");
           }
        }
            while(validaNota(notas[i]));//significa ou
           notas[nNotas] += notas[i];// acumula notas
        }//fim do for
             notas[nNotas] = notas[nNotas] / nNotas;//faz a média
            System.out.printf("Sua média foi de %.2f", notas[nNotas]);
            if(notas[nNotas]>= 7){
            System.out.println(" Parabens Você foi aprovado. ");
       }//fim do if  
            else{
            System.out.println(" Infelizmente voce não aprovou. ");
       }//fim else 
           }
           public static boolean validaNota(float nota){
           return nota < 0 || nota > 10;
           
          
    }//fim main
           public static float leiaFloat(){
               Scanner leia = new Scanner(System.in);
               try{
                   return leia.nextFloat();
               } catch (Exception e){
                   System.out.print("Valor não é núm, tente novamente");
                   return leiaFloat();
               }
    }//fim leiaFlotat()
           
}
   
