/*
	Andi Tahiri
	GFE
	202152219
*/	
package Ushtrimi4;

import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final String SENTINEL = "END";

        System.out.println("Shtypni nje string\n" +  SENTINEL   + " e perfundron loop");

        String fjala;
        int i = 0;

         do {
             fjala = sc.nextLine();
             System.out.println("Shenoni nje fjale tjeter:");
             if (!fjala.equals(SENTINEL)) {
                 if (endsWithSHKI(fjala))
                     i++;
             }
         }
         while (!fjala.equals(SENTINEL));
            System.out.println(" ");
            if (i == 0){
                System.out.println("Nuk jane shtypur asnje fjale qe perfundojne me SHKI");
            }else {
                System.out.println("Jane shtypur gjithsej " + i + " fjale qe perfundojne me SHKI");
            }

    }
        public static  boolean endsWithSHKI (String fjala){
            return fjala.endsWith("SHKI");
    }
}
