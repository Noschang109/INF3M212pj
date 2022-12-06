
package inf3m212pj;

import java.util.Scanner;

public class NOTASDEAULASMATRIZZZMENU {
    //declaração GLOBAL
    static String alunos[];
    static float notas[][];
    static int nAlunos,nNotas,contAlunos;
    
  
    public static void main(String[] args) {
        
        int opM;
        System.out.println("Notas Escolares Matriz");
        System.out.print("Quantos Alunos? ");
        nAlunos = (int) leiaFloat();
        System.out.println(" Quantas notas? ");
        nNotas = (int) leiaFloat();
        
        alunos = new String[nAlunos];
        notas = new float[nAlunos][nNotas +1];
       //nNotas +1 para ter uma posição para guardar a media
       do{
           menu();
           opM= (int) leiaFloat();
           switch(opM){//Escolha do portugol
               case 1:
                   inserirAlunoNotas();
                   break;
               case 2:
                   imprimirAlunosNotas();
                   break;
               case 0:
                   System.out.println("Aplicação Encerrada Pelo Usuario");
                   break;
               default:
                   System.out.println("Opção Invalida , tente novamente.!");
                   break;
           }//fim switch
       }while(opM!=0);
    }//fim main
    
    public static boolean validaNota(float nota) {
        return nota < 0 || nota > 10;
    }//fim bolean validaNota

    public static float leiaFloat() {
        Scanner leia = new Scanner(System.in);
        try {
            return leia.nextFloat();
        } catch (Exception e) {
            System.out.print("Valor não é núm, tente novamente");
            return leiaFloat();
        }
        
    }//fim leia float
    
         public static void menu(){ 
             System.out.println("1- Inserir Notas do Aluno: ");
             System.out.println("2- Imprimir Notas: ");
             System.out.println("0- Sair");
             System.out.print("Digite  Aqui: ");
         }//fim menu
         
         public static void inserirAlunoNotas(){
             Scanner leia = new Scanner(System.in);
             if(contAlunos < nAlunos){
            System.out.println("Nome do aluno: ");
            alunos[contAlunos] = leia.next();
            
            for (int j = 0; j < nNotas; j++) {//PERCORRE AS NOTAS
                do {
                    System.out.print("Digite a" +(j + 1) + "° Nota: ");
                    notas[contAlunos][j] = leiaFloat();
                    if(validaNota(notas[contAlunos][j])){
                        System.out.println("Nota invalida , tente novamente!");
                    }
                }while (validaNota(notas[contAlunos][j]));
                notas[contAlunos][nNotas] += notas[contAlunos][j];// acumula as notas
         }//fim for notas
            notas[contAlunos][nNotas] = notas[contAlunos][nNotas] / nNotas;//calc media
                contAlunos++;
             }else{//fim if alunos
                 System.out.println("Não é mais possivel lançar notas." + "nTodas posições ocupadas.");
             }//fim else
         }//fim do inserirAlunoNotas

         public static void imprimirAlunosNotas(){
         System.out.println("n--Resultado---\n");
       for(int i = 0;i <contAlunos; i++){
        System.out.printf(alunos[i] + "Sua media foi de: %.2f", notas[i][nNotas]);
        if(notas[i][nNotas]>= 7){
            System.out.println("Voce foi aprovado");
        }else{System.out.println("Infelizmente vc foi reprovado");  
    }//fim else
    }//fim do for de saida no console
    
         }//fim imprimir alunos notas

}//fim do programa