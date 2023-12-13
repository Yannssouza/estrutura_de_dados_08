package Atividades;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        int opcao = 1;
        Queue<String> fila = new LinkedList<>();
        Scanner leia = new Scanner(System.in);

        while(opcao != 0) {
            System.out.println("""
                ******************************************************************
                                
                               1: Adicionar um novo Cliente na fila
                               2: Listar todos os Clientes
                               3: Retirar Cliente da Fila
                               0: Sair
                                    
                ******************************************************************
                Entre com a opção desejada:\s""");

            opcao = leia.nextInt();
            leia.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o nome do cliente:");
                String nome = leia.nextLine();
                fila.add(nome);
                System.out.println("Cliente Adicionado!");
            } else if (opcao == 2) {
                if (fila.isEmpty()) {
                    System.out.println("A fila está vazia.");
                } else {
                    System.out.println("Clientes na fila:");
                    for (String cliente : fila) {
                        System.out.println(cliente);
                    }
                }
            } else if (opcao == 3) {
                fila.remove();
                System.out.println("O Cliente foi Chamado!");
            } else if (opcao == 0) {
                System.out.println("Programa Finalizado!");
            } else {
                System.out.println("Opção invalida!");
            }
        }

        leia.close();

    }

}
