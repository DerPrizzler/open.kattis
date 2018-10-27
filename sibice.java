import java.util.Scanner;
import java.lang.Math;
public class sibice {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] input = inp.split("\\s+");
        int n = Integer.parseInt(input[0]);
        int w = Integer.parseInt(input[1]);
        int h = Integer.parseInt(input[2]);

        double p = ((double)w*(double)w)+((double)h*(double)h);
        p = Math.sqrt(p);
        String[] output = new String[n];

        for (int i = 0; i < n; i++) {

            int z = sc.nextInt();
            if(z<=p)output[i] = "DA";
            else output[i]="NE";


        }

        for (int j = 0; j < n; j++) {
            System.out.println(output[j]);
        }


    }

}
