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
public class NOTASDEAULASMATRIZZZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Notas Escolares Matriz");
        System.out.print("Quantos Alunos? ");
        int nAlunos = (int) leiaFloat();
        System.out.println(" Quantas notas? ");
        int nNotas = (int) leiaFloat();
        String alunos[] = new String[nAlunos];
        float notas[][] = new float[nAlunos][nNotas + 1];
        //NOTAS +1 PRA TER UMA POSIÇÃO PARA GUARDAR AS NOTAS

        for (int i = 0; i < nAlunos; i++) {//PERCORRE OS ALUNOS
            System.out.println("Nome do aluno: ");
            alunos[i] = leia.next();
            for (int j = 0; j < nNotas; j++) {//PERCORRE AS NOTAS
                do {
                    System.out.print("Digite a" +(j + 1) + "° Nota: ");
                    notas[i][j] = leiaFloat();
                    if(validaNota(notas[i][j])){
                        System.out.println("Nota invalida , tente novamente!");
                    }
                }while (validaNota(notas[i][j]));
                notas[i][nNotas] += notas[i][j];// acumula as notas
         }//fim for notas
            notas[i][nNotas] = notas[i][nNotas] / nNotas; //calc media
     }//fim for alunos
        
    
       System.out.println("n--Resultado---\n");
       for(int i = 0;i <nAlunos; i++){
        System.out.printf(alunos[i] + "Sua media foi de: %.2f", notas[i][nNotas]);
        if(notas[i][nNotas]>= 7){
            System.out.println("Voce foi aprovado");
        }else{System.out.println("Infelizmente vc foi reprovado");  
    }
    }
    }//fim Main   
    public static boolean validaNota(float nota) {
        return nota < 0 || nota > 10;
    }

    public static float leiaFloat() {
        Scanner leia = new Scanner(System.in);
        try {
            return leia.nextFloat();
        } catch (Exception e) {
            System.out.print("Valor não é núm, tente novamente");
            return leiaFloat();
        }
        
    }
}
