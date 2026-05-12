package String;

public class CompressString {
    public static void main(String[] args) {

        String str = "aaabbcc";
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='a'){
                aCount++;
            } else if (str.charAt(i)=='b') {
                bCount++;
            }
            else {
                cCount++;
            }
        }
        System.out.println("a"+aCount+"b"+bCount+"c"+cCount);


    }
}
