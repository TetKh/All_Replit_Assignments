package Collection.LinkedList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {


    public static void main(String[] args) {


        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 20000000; i++) {
            linkedList.add(12);
        }

        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 20000000; i++) {
            arrayList.add(10);
        }


        long startTime = System.currentTimeMillis();

        arrayList.get(999999);

        long endTime = System.currentTimeMillis();

        System.out.println("Collection.List.ArrayList: " + (endTime-startTime));

        long startTime1 = System.currentTimeMillis();

        linkedList.get(999999);

        long endTime1 = System.currentTimeMillis();

        System.out.println("Collection.LinkedList: " + (endTime1-startTime1));




    }
}
