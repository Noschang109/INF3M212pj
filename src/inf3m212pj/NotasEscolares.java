/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m21210;

import java.util.Scanner;

/**
 *
 * @author jbferraz
 */
public class NotasEscolares {//equivalo ao programa{ do Portugol
//Nesta área posso definir as variaveis 'globais'

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Nesta área posso definir as variaveis 'locais'
        float nota1, nota2, nota3, nota4, media;
        Scanner leia = new Scanner(System.in);

        System.out.println("Notas Escolares");
        System.out.print("Informe a 1ª nota: ");
        nota1 = leia.nextFloat();
        System.out.print("Informe a 2ª nota: ");
        nota2 = leia.nextFloat();
        System.out.print("Informe a 3ª nota: ");
        nota3 = leia.nextFloat();
        System.out.print("Informe a 4ª nota: ");
        nota4 = leia.nextFloat();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua média foi de: " + media);
        if(media>=7){
            System.out.println("Voce foi aprovado");
        }else{
            System.out.println("infelizmente voce reprovou");
        }
    }

}
