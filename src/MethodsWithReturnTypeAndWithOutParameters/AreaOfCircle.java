package MethodsWithReturnTypeAndWithOutParameters;

public class AreaOfCircle {

    public double circle(){
        double radius = 7;
        double area = Math.PI * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        AreaOfCircle obj = new AreaOfCircle();
        double a = obj.circle();
        System.out.println(a);
    }
}
