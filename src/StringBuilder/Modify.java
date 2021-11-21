package StringBuilder;

public class Modify {

        public static void main(String[] args) {


            // Create a StringBuilder object sb with value "Talk is cheap."

            StringBuilder sb = new StringBuilder("Talk is cheap.");

            // Modify sb to display "Talk is cheap. Show me the code."

            System.out.println(sb.append(" Show me the code.")); // Talk is cheap. Show me the code.

            //Modify sb to display "Empty talk is cheap. Show me the code."

            System.out.println(sb.replace(0, 1, "Empty t")); // Empty talk is cheap. Show me the code.

            //Modify sb to display "Empty talk is useless. Show me the code."

            System.out.println(sb.replace(14, 19, "useless")); // Empty talk is useless. Show me the code.

            //Modify sb to display "Empty talk is useless and no good. Show me the code."

            System.out.println(sb.replace(21, 22, " and no good.")); // Empty talk is useless and no good. Show me the code.

            //Modify sb to display "Empty talk is no good. Show the code."

            System.out.println(sb.replace(14, 26, "")); // Empty talk is no good. Show me the code.

            //Modify sb to display "Talk less. Code more."

            System.out.println(sb.replace(0, 7, "T").delete(4, sb.length()).append(" less. Code more.")); // Talk less. Code more.

            //Modify sb to display ".erom edoC .ssel klaT"

            System.out.println(sb.reverse()); // .erom edoC .ssel klaT





        }
    }
