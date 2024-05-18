package com.meuprojeto.gerenciadordetarefas.organizadordetarefas.ui;

import com.meuprojeto.gerenciadordetarefas.organizadordetarefas.model.Tarefa;
import com.meuprojeto.gerenciadordetarefas.organizadordetarefas.service.GerenciadorDeTarefas;

import java.util.Scanner;

public class InterfaceUsuario {
    private GerenciadorDeTarefas gerenciador;
    private Scanner scanner;

    public InterfaceUsuario() {
        this.gerenciador = new GerenciadorDeTarefas();
        this.scanner = new Scanner(System.in);
    }

    public void menuPrincipal() {
        while (true) {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Marcar Tarefa como Concluída");
            System.out.println("4. Remover Tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // consumir nova linha

            switch (opcao) {
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    listarTarefas();
                    break;
                case 3:
                    marcarComoConcluida();
                    break;
                case 4:
                    removerTarefa();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void adicionarTarefa() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        gerenciador.adicionarTarefa(new Tarefa(titulo, descricao));
    }

    private void listarTarefas() {
        gerenciador.listarTarefas();
    }

    private void marcarComoConcluida() {
        System.out.print("ID da tarefa: ");
        int id = scanner.nextInt();
        gerenciador.marcarComoConcluida(id);
    }

    private void removerTarefa() {
        System.out.print("ID da tarefa: ");
        int id = scanner.nextInt();
        gerenciador.removerTarefa(id);
    }
}
