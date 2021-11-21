package Basics;

public class GetRandomCreditCardNo1 {

    public static void main(String[] args) {
        long l = 123456789012345L;
        int cd = generateCheckDigit(l);
        System.out.println("Valid card number="+l+cd);
    }


    private static int generateCheckDigit(long l) {
        String str = Long.toString(l);
        int[] ints = new int[str.length()];
        for(int i = 0;i< str.length(); i++){
            ints[i] = Integer.parseInt(str.substring(i, i+1));
        }
        for(int i = ints.length-2; i>=0; i=i-2){
            int j = ints[i];
            j = j*2;
            if(j>9){
                j = j%10 + 1;
            }
            ints[i]=j;
        }
        int sum=0;
        for(int i = 0;i< ints.length; i++){
            sum+=ints[i];
        }
        if(sum%10==0){
            return 0;
        }else return 10-(sum%10);
    }


}
