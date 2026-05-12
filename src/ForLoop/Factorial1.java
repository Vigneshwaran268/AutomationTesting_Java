package ForLoop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int num = sc.nextInt();

        int f = 1;

        for(int i = num; i>=1; i--){
            f = f*i;

        }
        System.out.println(f);
    }
}
