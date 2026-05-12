package MethodOverRiding;

public class InstaVersion2 extends InstaVersion1 {

    @Override
    public void story(){
        System.out.println("You can post 30 seconds videos as story");
    }

    @Override
    public void post(){
        System.out.println("you can post multiple photos with music");
    }
}
