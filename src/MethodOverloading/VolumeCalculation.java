package MethodOverloading;

public class VolumeCalculation {

    //Cube
    public void volume(int a){
        System.out.println("Volume of cube: "+a*a*a);
    }

    //Cuboid
    public void volume(int length, int breadth, int height){
        System.out.println("Volume of cuboid: "+length*breadth*height);
    }

    //Cylinder
    public void volume(double radius, int height){
        System.out.println("Volume of Cylinder: "+Math.PI*radius*radius*height);
    }

    public static void main(String[] args) {
        VolumeCalculation obj = new VolumeCalculation();
        obj.volume(5);
        obj.volume(4,5,6);
        obj.volume(3.87,7);
    }
}
