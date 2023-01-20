package com.syntaxReview3;

public class LoopsReview2 {
    public static void main(String[] args) {

        // create digital clock with nested loop
        //You code should print time starting 00:00 and ending 23:59.


        for (int i = 0; i <=23; i++) {
            for (int j = 0; j <=5 ; j++) {
                for (int k = 0; k <=9 ; k++) {
                    System.out.println(i+":"+j+k);
                    
                }



                }


            }

        /*
        //also like this with second:
        for (int h = 0; h <24 ; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    System.out.println(h+":"+m+":"+s);

                }
                
            }
            
        }
        */
         

        }

    }

