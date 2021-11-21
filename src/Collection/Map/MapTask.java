package Collection.Map;

import java.util.*;

public class MapTask {


    public static void main(String[] args) {


        String text = "To Sherlock Holmes to is always the woman. I have seldom heard him mention her under any other name. In his eyes she eclipses and predominates the whole of her sex. It was not that he felt any emotion akin to love for Irene Adler. All emotions, and that one particularly, were abhorrent to his cold, precise but admirably balanced mind. He was, I take it, the most perfect reasoning and observing machine that the world has seen, but as a lover he would have placed himself in a false position. He never spoke of the softer passions, save with a gibe and a sneer. They were admirable things for the observer—excellent for drawing the veil from men's motives and actions. But for the trained reasoner to admit such intrusions into his own delicate and finely adjusted temperament was to introduce a distracting factor which might throw a doubt upon all his mental results. Grit in a sensitive instrument, or a crack in one of his own high-power lenses, would not be more disturbing than a strong emotion in a nature such as his. And yet there was but one woman to him, and that woman was the late Irene Adler, of dubious and questionable memory";

        //  to=, she=20, the=34

        String[] split = text.split("[ \n\t\r;:!?(){},.]");

        System.out.println(Arrays.toString(split));
        
        Map<String, Integer> map = new TreeMap<>();


        for (int i = 0; i < split.length; i++) {
            String eachWord = split[i].toLowerCase();

            if( ! map.containsKey(eachWord)){
                map.put(eachWord, 1); // we are putting the count as 1 since it is the first occurence
            }else{
               int value = map.get(eachWord); // get the count of the word
               value++;  // increment the count by one
               map.put(eachWord, value); // update the count with the new count
            }


        }

        System.out.println(map);


    }
}
