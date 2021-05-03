/*
	Andi Tahiri
	GFE
	202152219
*/	
package Ushtrimi4;

import java.util.Scanner;

public class CiftPositivCount {
    public static  void  main (String [] args){

        Scanner sc = new Scanner(System.in);
        final int SENTINEL = -9999;

        System.out.println("Shtypni nje numer \n Numri -9999 e perfundon loop");

        int i;
        int countAll = 0;
        int count_6 = 0;
        do {
            i = sc.nextInt();
            System.out.println("Shtypni nje numer tjeter");
            if (i!= SENTINEL){
                countAll++;

                if (i > 0 && i % 6 ==0) {
                    count_6++;

                }

            }
        }
        while (i!= SENTINEL);
        if (countAll>0){
            System.out.println("Jane shtypur gjithsej "+ countAll + " numra, ku " + count_6 + " plotesojne kushtin");
        }else{
            System.out.println("Nuk eshte shtypur asnje numer!");
        }



    }
}
