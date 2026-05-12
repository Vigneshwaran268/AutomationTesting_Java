package MethodOverRiding;

public class AdminLogin extends Login{

    @Override
    public void login(){
        System.out.println("Admin in the company can login");
    }
}
