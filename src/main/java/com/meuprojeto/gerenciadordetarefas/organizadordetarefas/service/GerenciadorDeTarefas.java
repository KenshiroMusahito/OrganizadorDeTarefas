package com.meuprojeto.gerenciadordetarefas.organizadordetarefas.service;

import com.meuprojeto.gerenciadordetarefas.organizadordetarefas.model.Tarefa;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GerenciadorDeTarefas {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void adicionarTarefa(Tarefa tarefa) {
    }

    public void listarTarefas() {
    }

    public void marcarComoConcluida(int id) {
    }

    public void removerTarefa(int id) {
    }
}