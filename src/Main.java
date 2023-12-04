import DAO.USERDAO;
import DAO.USERINCREMENT;
import Entitys.user;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        user u = new user();
        u.setNome("wendel");
        u.setLogin("del");
        u.setSenha("123");
        u.setEmail("del@gmail.com");
       // USERINCREMENT userIncrement = new USERINCREMENT();
       // List<user> z = new ArrayList<>();

        //z = userIncrement.preencherArrayUsuarios();
        new USERDAO().RegisterUser(u);

        //System.out.println("o id do usuario é: "z.get() );
    }
}