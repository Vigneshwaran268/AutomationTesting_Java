package Practice;

import java.util.Locale;

public class Demo18 {

    public void test(){
        String a = "abcdef";
        String b = "xyz1234";
        String c = "abcxy";

        //Verify length of the A variable should be greater than length of the C variable and should be less than length of the B variable.
        if(a.length() > c.length() && a.length() < b.length()){
            System.out.println("Verification Passed");
        }
        else {
            System.out.println("Verification failed");
        }

        //A variable should not be same as B variable and C variable
        if(!a.equals(b)  && !a.equals(c)){
            System.out.println("Verification Passed");
        }
        else {
            System.out.println("Verification failed");
        }

        //C variable should be same as A variable irrespective of the case
        if(c.equalsIgnoreCase(a)){
            System.out.println("Verification Passed");
        }
        else {
            System.out.println("Verification failed");
        }

        //A variable should contains cd and should not contains xy
        if(a.contains("cd") && !a.contains("xy")){
            System.out.println("Verification Passed");
        }
        else{
            System.out.println("Verification failed");
        }

        //Convert B variable into uppercase and verify it should contains “Z” & should not contains “z”*/
        String str = b.toUpperCase();
        if(str.contains("Z") && !str.contains("z")){
            System.out.println("Verification Passed");
        }
        else {
            System.out.println("Verification failed");
        }

    }

    public static void main(String[] args) {
        Demo18 obj = new Demo18();
        obj.test();
    }
}
