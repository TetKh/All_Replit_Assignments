package Collection.Map;

import java.util.*;

public class ListOfMaps {

    public static void main(String[] args) {
        Object[][] info = {
                {"Name", "Email", "Phone Number", "Credit Card"},
                {"Anetta Pozer", "apozer0@gizmodo.com", "631-331-4898", 3552421786057285L},
                {"Ilario Overlow", "ioverlow1@sakura.ne.jp", "512-969-3178", 5007666062273933L},
                {"Jenni Bowdery", "jbowdery2@creativecommons.org", "240-981-3226", 3574299080159492L},
                {"Phyllys Karppi", "pkarppi3@cnbc.com", "628-686-9886", 3589734035932315L},
                {"Adelbert Yitzovicz", "ayitzovicz4@jigsy.com", "203-467-0276", 3576321404492926L}

        };

        System.out.println(arrayToListOfMaps(info));
    }

        public static List<Map<String, Object>> arrayToListOfMaps(Object [][] info){
        List<Map<String, Object>>  listOfMaps = new ArrayList<>();

        Object[] headerRow = info[0];

        for (int i = 1; i < info.length; i++) {

            Map<String, Object> row = new LinkedHashMap<>();

            for (int j = 0; j < info[i].length; j++) {
                row.put((String) headerRow[j], info[i][j]);
            }
            listOfMaps.add(row);
        }
        return listOfMaps;
    }
}
