import java.util.Scanner;
public class estimate {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] output = new int[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            char[] rechn = input.toCharArray();
            output[i] = rechn.length;
        }
        for (int j = 0; j < n; j++) {
            System.out.println(output[j]);
        }

    }

}
