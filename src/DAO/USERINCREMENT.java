package DAO;

import Conexão.Conexao;
import Entitys.user;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class USERINCREMENT {
    public List<user> preencherArrayUsuarios() {
        List<user> usuarios = new ArrayList<>();

        try {
            String consulta = "SELECT user_id, nome, login, senha, email FROM usuario";
            PreparedStatement pstmt = Conexao.getConexao().prepareStatement(consulta);
            ResultSet resultado = pstmt.executeQuery();

            while (resultado.next()) {
                user user = new user();
                user.setCodigo(resultado.getInt("user_id"));
                user.setNome(resultado.getString("nome"));
                user.setLogin(resultado.getString("login"));
                user.setSenha(resultado.getString("senha"));
                user.setEmail(resultado.getString("email"));
                usuarios.add(user);
            }


            resultado.close();
            pstmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }
}