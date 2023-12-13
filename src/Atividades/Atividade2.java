package Atividades;

import java.util.Scanner;
import java.util.Stack;

public class Atividade2 {

    public static void main(String[] args) {
        int opcao = 1;
        Stack<String> pilha = new Stack<>();
        Scanner leia = new Scanner(System.in);

        while(opcao != 0) {
            System.out.println("""
                ******************************************************************
                                
                               1: Adicionar Livro na pilha
                               2: Listar todos os Livros
                               3: Retirar da pilha
                               0: Sair
                                    
                ******************************************************************
                Entre com a opção desejada:\s""");

            opcao = leia.nextInt();
            leia.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o nome do livro:");
                String nome = leia.nextLine();
                pilha.push(nome);
                System.out.println("Livro Adicionado!");
            } else if (opcao == 2) {
                if (pilha.isEmpty()) {
                    System.out.println("A pilha está vazia.");
                } else {
                    System.out.println("Livros na pilha:");
                    for (String cliente : pilha) {
                        System.out.println(cliente);
                    }
                }
            } else if (opcao == 3) {
                pilha.pop();
                System.out.println("Um Livro foi retirado da pilha!\n");
            } else if (opcao == 0) {
                System.out.println("Programa Finalizado!");
            } else {
                System.out.println("Opção invalida!");
            }
        }

        leia.close();

    }

}
