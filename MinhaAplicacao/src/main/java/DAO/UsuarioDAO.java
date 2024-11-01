package DAO;
import factory.ConnectionFactory;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;

public class UsuarioDAO {
    private Connection connection;
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;

    public UsuarioDAO(){
        this.connection = new Connection();
    }

    String sql = "INSERT INTO usuario(nome,cpf,email,telefone) VALUES(?,?,?,?)";
}
