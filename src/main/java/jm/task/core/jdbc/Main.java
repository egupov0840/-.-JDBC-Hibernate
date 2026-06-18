package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Donald", "Campbell", (byte) 20);
        userService.saveUser("John", "King", (byte) 25);
        userService.saveUser("John", "Rivera", (byte) 18);
        userService.saveUser("Calvin", "Palmer", (byte) 40);

        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
