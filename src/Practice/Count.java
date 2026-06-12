


/*Count the occurrance of each element
//  ("java","python","java","c","c","python","java","c")

*/


package Practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Count {

    public static void main(String[] args) {

//        List<String> language = new ArrayList<>(Arrays.asList("java","python","java","c","c","python","java","c"));
//
//
//
//        for(int i=0; i<language.size(); i++){
//            String first = language.get(i);
//            int count = 0;
//
//            for(String lang: language){
//            if(lang.equals(first)){
//                count++;
//            }
//
//        }
//            System.out.println(first + " : " + count);
//            }


        List<String> list1 = Arrays.asList("Java", "Python", "Java", "C", "Python");

        for (int i = 0; i < list1.size(); i++) {
            String ele1 = list1.get(i);
            int count = 0;

            for (String e : list1) {
                if (e.equals(ele1)) {
                    count++;
                }
            }

            System.out.println(ele1 + " : " + count);
        }


    }
}
