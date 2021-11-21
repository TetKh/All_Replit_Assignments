package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseList {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("purple", "green", "blue", "yellow", "green");

        System.out.println(reverseList(list));

        List<String> list2 = Arrays.asList("jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way");

        System.out.println(reverseList(list2));

    }


    public static List<String> reverseList(List<String> stringList) {

        List<String> reverse = new ArrayList<>();

        for (int i = stringList.size() - 1; i >= 0; i--) {
            reverse.add(stringList.get(i));

        }

        return reverse;
    }
}

/*
Collection.List<String> reverse = new Collection.List.ArrayList<>(stringList);

        for (int i = 0, j = reverse.size() - 1; i < j; i++) {

            reverse.add(i, reverse.remove(j));

        }

        return reverse;
    }
}
 */

/*
Given a Collection.List of Strings, return a new list in reverse order of the original.

   reverseList( ["purple", "green", "blue", "yellow", "green" ])  -> ["green", "yellow", "blue", "green", "purple" ]
	 reverseList( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"] )
		-> ["way", "the", "all", "jingle", "bells", "jingle", "bells", "jingle"]
 */
