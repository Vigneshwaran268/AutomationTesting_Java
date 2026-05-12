package Practice_1;

public class VowelsCount {

    public static void main(String[] args) {

        String str = "Testing";
        int count = 0;

        str = str.toLowerCase();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            if(c=='a' || c=='e' || c=='i' ||c=='o' || c=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
