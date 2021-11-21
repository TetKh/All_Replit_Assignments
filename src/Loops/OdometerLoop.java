package Loops;

public class OdometerLoop {
    public static void main(String[] args) throws InterruptedException {
        for ( int thousand=0; thousand<10; thousand++ )
        {
            for ( int hundred=0; hundred<10; hundred++ ) {
                for (int tens = 0; tens < 10; tens++) {
                    for (int ones = 0; ones < 10; ones++) {
                        for (int one1 = 0; one1 < 10; one1++) {
                            for (int one2 = 0; one2 < 10; one2++) {
   System.out.print(" " + thousand + "" + hundred + ":" + tens + "" + ones + ":" + one1 + "" + one2 +"\r");
   Thread.sleep(10);
      }
      }
      }
      }
      }
        }

                System.out.println();
            }
}
