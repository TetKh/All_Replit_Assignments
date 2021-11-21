package Array2D;

public class Test {
    public static void main(String[] args) {


        String[][] chs = new String[5][2];
        chs[0] = new String[2];
        chs[1] = new String[5];
        int i = 97;

        for (int a = 0; a < chs.length; a++ )	{
            for (int b = 0; b < chs.length; b++ ) {
                chs [a][b] = "" + i;
                i++;
            }
        }
        for (String[] ca : chs) {
            for (String c : ca) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
      /*
        A) An ArraylndexOutOfBoundsException is thrown at runtime.
        B) A NullPointerException is thrown at runtime.
        C) 	97 98
            99 100 null null null
        D) 	97 98
       */

    }

}

