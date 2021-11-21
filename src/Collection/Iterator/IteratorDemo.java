package Collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);



        Iterator<Integer> iter = list.iterator();

//       iter.next(); // 2
//       iter.next(); // 3
//       System.out.println(iter.next());



        while(iter.hasNext()){
            if(iter.next() % 2 != 0){
               iter.remove();
            }
        }

        System.out.println(list); // [2, 4, 6]


    }
}
