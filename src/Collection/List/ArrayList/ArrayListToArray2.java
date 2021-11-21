package Collection.List.ArrayList;
import java.util.*;
public class ArrayListToArray2 {

        public static void main(String[] args) {
            List<String> l=new ArrayList<>();
            l.add("Apple");
            l.add("Orange");
            l.add("Banana");
            String[] s=list2Array(l);
            for(String s1 : s) {
                System.out.print( s1+" , ");
            }
        }
        public static String[] list2Array(List<String> stringList) {
            int n = stringList.size();
            String[] temp = new String[n];
            for(int i = 0; i < n; i++) {
                temp[i] = stringList.get(i);
            }
            return temp;
        }
}
