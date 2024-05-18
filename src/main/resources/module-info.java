module com.meuprojeto.gerenciadordetarefas.organizadordetarefas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.meuprojeto.gerenciadordetarefas.organizadordetarefas to javafx.fxml;
    exports com.meuprojeto.gerenciadordetarefas.organizadordetarefas;
    exports com.meuprojeto.gerenciadordetarefas.organizadordetarefas.model;
    opens com.meuprojeto.gerenciadordetarefas.organizadordetarefas.model to javafx.fxml;
    exports com.meuprojeto.gerenciadordetarefas.organizadordetarefas.service;
    opens com.meuprojeto.gerenciadordetarefas.organizadordetarefas.service to javafx.fxml;
}