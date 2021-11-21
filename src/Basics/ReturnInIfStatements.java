package Basics;

public class ReturnInIfStatements {

        public static void main(String[] args) {

            incrementByOne(9);
        }

        public static int incrementByOne(int num){

            if(num>10){
                num++;

            }else {
                num--;

            }
                return num;
            

        }


    }

