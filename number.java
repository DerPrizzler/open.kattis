//TEST

import java.util.Scanner;
public class number {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] output = new String[n];
        for (int i = 0; i < n; i++) {

            String input= sc.nextLine();
            String[] in = input.split("\\s+");
            int a = Integer.parseInt(in[0]);
            int b = Integer.parseInt(in[1]);
            int c = Integer.parseInt(in[2]);
            if(((a+b)==c)||((a*b)==c)||((a-b)==c)||((b-a)==c)||(((double)a/(double)b)==(double)c)||(((double)b/(double)a)==(double)c)){
                output[i] = "Possible";
            }
            else{
                output[i] = "Impossible";
            }

        }

        for (int j = 0; j < n; j++) {
            System.out.println(output[j]);
        }
          asdasdasdasd

    }

}
