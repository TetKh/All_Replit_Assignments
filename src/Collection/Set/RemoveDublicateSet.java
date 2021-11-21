package Collection.Set;

import java.util.*;

public class RemoveDublicateSet {

    public static void main(String[] args) {

        String str = "aaaffffbccccdde";
        removeDiblicare(str);


    }

    public static void removeDiblicare(String str){

        String str1 [] = str.split("");

        List<String> al = Arrays.asList(str1);

        Set<String> remove = new LinkedHashSet<>(al);

        System.out.println(remove);

    }
}