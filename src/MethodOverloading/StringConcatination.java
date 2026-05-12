package MethodOverloading;

public class StringConcatination {

    public String concat(String s1, String s2){
        return s1+" "+s2;
    }

    public String concat(String s1, String s2, String s3){
        return s1+" "+s2+" "+s3;
    }

    public static void main(String[] args) {
        StringConcatination obj = new StringConcatination();
        String str1 = obj.concat("Hello", "World");
        System.out.println(str1);
        String str2 = obj.concat("Automation", "Testing", "Training");
        System.out.println(str2);
    }
}
