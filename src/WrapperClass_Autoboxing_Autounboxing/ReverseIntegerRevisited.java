package WrapperClass_Autoboxing_Autounboxing;

public class ReverseIntegerRevisited {

    public static void main(String[] args) {

        //TESTS

        System.out.println(reverse(123456)); // 654321
        System.out.println(reverse(-123456)); // -654321
        System.out.println(reverse(1147483647)); // 0  -> because 7463847411 is out of range for int
        System.out.println(reverse(2110000002)); // 2000000112
        System.out.println(reverse(-1366899991)); //-1999986631
        System.out.println(reverse(-2147321113)); // 0  -> because -3111237412 is out of range for int

    }


    public static int reverse(int x) {  //do not change the method parameter and return type

            boolean isNegative = x < 0 ? true : false;
            if (isNegative) {
                x = x * -1;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(x));
            long reverse = Long.parseLong(sb.reverse().toString());
            long result = isNegative == true ? reverse * -1 : reverse;
            return (result < Integer.MAX_VALUE && result > Integer.MIN_VALUE) ? (int)result : 0;
        }
    }

    /*
    int y = 0;
            while (x != 0) {
                int z = y * 10 + x % 10;
                if ((z - x % 10) / 10 != y)
                    return 0;
                else y = z;
                x = x / 10;
            }
            return y;
        }
    }
     */

