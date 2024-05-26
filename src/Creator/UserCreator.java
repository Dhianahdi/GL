package Creator;

public class UserCreator {
    public static User createUser(String firstName, String lastName, String email, String password) {

        User user = new User(firstName, lastName, email, password);

        return user;
    }
}
