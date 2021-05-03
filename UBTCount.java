/*
	Andi Tahiri
	GFE
	202152219
*/	
package Ushtrimi4;
import java.util.Scanner;

public class UBTCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String SENTINEL = "EXIT";

        String fjalia;
        int count = 0;

        do {
            System.out.println("Sheno fjale ose fjali: \n"+(SENTINEL)+ " e prfundon loop:" );
            fjalia = input.nextLine();
            if (!fjalia.equals(SENTINEL)){
                if (countUBT(fjalia))
                    count++;
            }

        }while (!fjalia.equals(SENTINEL));
        System.out.println(" ");
        if (count == 0){
            System.out.println("Nuk eshte shtyp UBT");
        }else {
            System.out.println("Jane shtypur gjithsej: " + count);
        }
    }
    public static boolean countUBT(String fjalia){
        return fjalia.contains("UBT");
    }
}