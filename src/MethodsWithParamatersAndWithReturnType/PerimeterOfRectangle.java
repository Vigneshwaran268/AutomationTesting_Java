package MethodsWithParamatersAndWithReturnType;

public class PerimeterOfRectangle {

    public int find(int length, int breadth){
        int perimeter = 2*(length+breadth);
        return perimeter;
    }

    public static void main(String[] args) {
        PerimeterOfRectangle obj = new PerimeterOfRectangle();
        int result = obj.find(2,3);
        System.out.println(result);
    }
}
