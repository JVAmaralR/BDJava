package DAO;

import Conexão.Conexao;
import Entitys.user;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class USERDAO {

    public void RegisterUser(user user){
        String sql = "INSERT INTO USUARIO(NOME, LOGIN, SENHA, EMAIL) VALUES (?, ?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps= Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, user.getNome());
            ps.setString(2, user.getLogin());
            ps.setString(3, user.getSenha());
            ps.setString(4, user.getEmail());

            ps.execute();
            ps.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
