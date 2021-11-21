package StringMethods;

public class Class_IndexOf {


        public static void main(String[] args) {

            String str = "Just do that and it";

            System.out.println(str.indexOf('J')); // 0
            System.out.println(str.indexOf('t')); // 3
            System.out.println(str.lastIndexOf('t'));// 18

            int firstIndexOfT = str.indexOf('t');
            int secondIndexOfT = str.indexOf('t',firstIndexOfT+1 );
            System.out.println(firstIndexOfT);
            System.out.println(secondIndexOfT);
            System.out.println(str.indexOf('t', secondIndexOfT+1));


            String str2 = "ughhhh I spent a 6 hour a day on that exercise hours";

            System.out.println(str2.indexOf('6'));
            System.out.println(str2.indexOf('z')); // -1
            System.out.println(str2.indexOf(97));  // looks for 'a''s index

            System.out.println(str2.indexOf("hour"));

            System.out.println(str2.substring(str2.indexOf("hour"),
                    str2.indexOf("hour")+4));


            System.out.println(str2.lastIndexOf("hour"));


            // replace method

            String str3 = "ThЯ trim thrЯw mЯ off";

            System.out.println(str3.replace('Я', 'e'));

            String str4 = "we can do this we with strings we too right? not we only chars?";

            System.out.println(str3.replace('Я', 'e'));

            System.out.println(str4.replace("we", "I"));


            String str5 =  "$39,000" ; // 39000
            str5 =  str5.
                    replace("$", "").
                    replace(",", "");

            System.out.println(Integer.parseInt(str5) + 1000);


            int num = 3000;

            String st3 = String.valueOf(num);

            System.out.println( String.valueOf('a') + String.valueOf('b'));

//        System.out.println('a' + 'b');

            String slovo = "Tut i tam mnogo tatam";

            System.out.println(slovo.indexOf("t"));
            System.out.println(slovo.lastIndexOf("t"));
            int firstIndexOfSlovo = slovo.indexOf("t");
            System.out.println(slovo.indexOf("t", firstIndexOfSlovo+1));
            System.out.println(slovo.indexOf("t", slovo.lastIndexOf("t")-2));


            int nomer = 33;
            int nomer2 = 44;

            System.out.println(nomer + nomer2); // 77

            String nomer3 = String.valueOf(nomer);
            String nomer4 = String.valueOf(nomer2);

            System.out.println(nomer3 + nomer4); // 3344

            int nomerAgain = Integer.parseInt(nomer3);
            int nomer2Again = Integer.parseInt(nomer4);

            System.out.println(nomerAgain + nomer2Again); // 77



        }
    }


