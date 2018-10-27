import java.util.Scanner;
public class justaminute {

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();
            int minuten=0;
            int sekunden=0;

            for(int i=0;i<n;i++){

                String input = sc.nextLine();
                String[] work= input.split("\\s+");
                int z = Integer.parseInt(work[0]);
                minuten +=z;
                z= Integer.parseInt(work[1]);
                sekunden += z;

            }//end for

            double erg = (double)sekunden/((double)minuten*60);
            if (erg<=1)System.out.println("measurement error");
            else System.out.println(erg);

        } //end main

}
