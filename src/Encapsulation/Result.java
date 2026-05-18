package Encapsulation;

public class Result {

    private int maths;
    private int science;
    private int tamil;

    public void setMarks(int m, int s, int t){
        maths = m;
        science = s;
        tamil = t;
    }

    public int getTotal(){
        return maths + science + tamil;
    }

    public double getaverage(){
        return getTotal()/3.0;
    }
}

class MainClass_16{
    public static void main(String[] args) {
        Result obj = new Result();
        obj.setMarks(67,89,90);
        System.out.println("Total Marks: "+obj.getTotal());
        System.out.println("Average: "+obj.getaverage());
    }
}
