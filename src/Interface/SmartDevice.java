/*Smart Home Device Controller

Create a smart device management system.

Requirements:

Interface: SmartDevice
Methods:
turnOn()
turnOff()
getStatus()
Classes:

SmartLight
SmartFan
SmartAC
Real-time Concept:

Used in IoT applications and home automation systems.

 */

package Interface;

interface SmartDevice {
    void turnOn();
    void turnOff();
    void getStatus();
}

class SmartLight implements SmartDevice{
    public void turnOn(){
        System.out.println("Smart Light turned on");
    }
    public void turnOff(){
        System.out.println("Smart Light turned off");
    }
    public void getStatus(){
        System.out.println("Smart Light is active");
    }
}

class SmartFan implements SmartDevice{
    public void turnOn(){
        System.out.println("Smart Fan turned on");
    }
    public void turnOff(){
        System.out.println("Smart Fan turned off");
    }
    public void getStatus(){
        System.out.println("Smart Fan is active");
    }
}

class SmartAC implements SmartDevice{
    public void turnOn(){
        System.out.println("Smart AC turned on");
    }
    public void turnOff(){
        System.out.println("Smart AC turned off");
    }
    public void getStatus(){
        System.out.println("Smart AC is active");
    }
}

class MainDevice{
    public static void main(String[] args) {
        SmartDevice obj;
        obj = new SmartLight();
        obj.turnOn();
        obj.turnOff();
        obj.getStatus();
        obj = new SmartFan();
        obj.turnOn();
        obj.turnOff();
        obj.getStatus();
        obj = new SmartAC();
        obj.turnOn();
        obj.turnOff();
        obj.getStatus();
    }
}
