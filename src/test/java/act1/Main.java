package act1;

import act2.User;
import act2.UserManager;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Obtener instancia de la clase Singleton
        UserManager instancia0 = UserManager.getInstance();
        System.out.println(instancia0);

        //Crear dos usuarios
        User u1 = new User("Alvaro");
        User u2 = new User("Joaquin");

        //Añadir usuarios con el método addUser
        UserManager.addUser(u1);
        UserManager.addUser(u2);

        //Obtener usuarios con el método getAllUsers
        List<User> obtenerUsuarios = UserManager.getAllUsers();
        System.out.println(obtenerUsuarios);


    }
}
