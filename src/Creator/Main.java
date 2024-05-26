package Creator;

import Creator.UserCreator;

public class Main {
    public static void main(String[] args) {
    	
        User newUser = UserCreator.createUser("Louai", "Souei", "Louai.souei01@gmail.com", "123456");
        
        System.out.println("User created: " + newUser.getFirstName() + " " + newUser.getLastName() + ", Email: " + newUser.getEmail());
    }
}
