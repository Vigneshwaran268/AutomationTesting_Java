package SingleInheritance;

public class Circle extends Shape{

    public void Area(){
        double radius = 5;
        double area = Math.PI * radius * radius;
        System.out.println("Area: "+area);
    }
}
