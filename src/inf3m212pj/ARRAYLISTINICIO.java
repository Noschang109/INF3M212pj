package inf3m212pj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ARRAYLISTINICIO {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        System.out.println(" Tamanho do array: " + nomes.size());
        System.out.println("ArrayList vazio?");
        System.out.println(nomes.isEmpty());

        nomes.add("Mateus");

        System.out.println(" Tamanho Da arrayList " + nomes.size());
        System.out.print("Digite um nome : ");

        nomes.add(leia.next());
        nomes.add(0, "Kiara");

        System.out.println(" Tamanho Da arrayList " + nomes.size());
        System.out.println(nomes.toString());

        System.out.println(" Tamanho Da arrayList " + nomes.size());
        System.out.println(nomes.toString());

        System.out.println("Impressao do Array");

        nomes.forEach(nome -> {
            System.out.println("Nome: " + nome);
        }); //fim impressao

        System.out.println("ArrayList vazio?");
        System.out.println(nomes.isEmpty());

        System.out.println("Index da Kiara é " + nomes.indexOf("Kiara"));

        System.out.println("Ordenação de Array");
        nomes.add("André");//COLOCAR NOMES NO ARRAY
        nomes.add("Jy");
        nomes.add("Thiago");
        nomes.add("Douglas");
        nomes.add("Marcos");

        System.out.println(nomes.toString());
        //Ordenação!
        Collections.sort(nomes);
        System.out.println("Ordenação: " + nomes.toString());

    }//fim main

}// fim programa
