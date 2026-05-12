package MethodsWithParamatersAndWithReturnType;

public class AreaOfCircle {

    public double find(int radius){
        double area = Math.PI * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        AreaOfCircle obj = new AreaOfCircle();
        double result = obj.find(5);
        System.out.println(result);
    }
}
