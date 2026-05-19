package Abstraction;

public interface RemoteControl {
    void powerOn();
}

class TV implements RemoteControl{
    public void powerOn(){
        System.out.println("TV Power On");
    }
}

class AC implements RemoteControl{
    public void powerOn(){
        System.out.println("AC Power On");
    }
}

class MainClass_9{
    public static void main(String[] args) {
        RemoteControl obj;
        obj = new TV();
        obj.powerOn();

        obj = new AC();
        obj.powerOn();
    }
}
