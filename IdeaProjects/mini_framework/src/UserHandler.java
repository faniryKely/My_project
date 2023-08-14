import Model.User;

import java.util.List;

public class UserHandler implements RouterHandler {

    @Override
    public void handle(Route route) {
        List<User> userList = userService.getUsers();
        for (User user: userList) {
            System.out.println(user);
        }
    }
}
