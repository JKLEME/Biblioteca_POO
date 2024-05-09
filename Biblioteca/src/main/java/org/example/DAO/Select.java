package org.example.DAO;

import org.example.conexao.JdbcConection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;

public class Select {

    public void create() {
        // Query SQL para inserção.
        String query = "INSERT INTO livros (titulo, preco) VALUES ('O Senhor dos Anéis 2', 79.90)";

        try (
                Connection conn = JdbcConection.getConnection();
                // Estabelece uma conexão com o banco.
                // Cria um PreparedStatement para executar a query.
                PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui os valores da pessoa para a query.
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
}
