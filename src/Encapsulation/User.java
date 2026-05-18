package Encapsulation;

public class User {

    private String userName;
    private String password;

    public void setter(String name, String pass){
        userName = name;
        password = pass;
    }

    public String getName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }
}

class MainClass_13{
    public static void main(String[] args) {
        User obj = new User();
        obj.setter("Vikki", "Vi@1324");
        System.out.println("User Name: "+obj.getName());
        System.out.println("Password: "+obj.getPassword());
    }
}
