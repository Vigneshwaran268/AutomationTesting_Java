package Abstraction;

abstract class Browser {

    abstract void open();
    abstract void close();
}

class Chrome extends Browser{

    void open() {
        System.out.println("Chrome Opens...");
    }

    void close() {
        System.out.println("Chrome close...");
    }
}

class Firefox extends Browser{
    void open() {
        System.out.println("Firefox Opens...");
    }

    void close() {
        System.out.println("Firefox close...");
    }
}

class Safari extends Browser{
    void open() {
        System.out.println("Safari Opens...");
    }

    void close() {
        System.out.println("Safari close...");
    }
}

class MainClass_1{
    public static void main(String[] args) {
        Browser obj;
        obj = new Chrome();
        obj.open();
        obj.close();
        System.out.println("-------------------------------------------");
        obj = new Firefox();
        obj.open();
        obj.close();
        System.out.println("-------------------------------------------");
        obj = new Safari();
        obj.open();
        obj.close();
    }
}
