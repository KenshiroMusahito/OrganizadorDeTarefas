package com.meuprojeto.gerenciadordetarefas.organizadordetarefas.persistence;

import com.meuprojeto.gerenciadordetarefas.organizadordetarefas.model.Tarefa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaDeTarefas {

    public void salvarTarefas(List<Tarefa> tarefas, String arquivo) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            oos.writeObject(tarefas);
        }
    }

    public List<Tarefa> carregarTarefas(String arquivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo))) {
            return (List<Tarefa>) ois.readObject();
        }
    }
}
