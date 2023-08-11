package act2;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class UserManager {

    private static UserManager instance = new UserManager();

    private static Map<String, User> users;


    private UserManager() {

        // Constructor privado para evitar instanciación directa

        users = new HashMap<>();

    }


    public static UserManager getInstance() {
        return instance;
    }


    public static void addUser(User user) {

        users.put(user.getUsername(), user);

    }

    public void removeUser(String username) {

        users.remove(username);

    }


    public User getUser(String username) {

        return users.get(username);

    }


    public static List<User> getAllUsers() {

        return new ArrayList<>(users.values());

    }

    @Override
    public String toString() {
        return "UserManager{" +
                "users=" + users +
                '}';
    }
}