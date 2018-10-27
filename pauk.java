import java.util.Scanner;
public class pauk {

    public static void main(String[] args){

        Scanner sc  = new Scanner(System.in);
        String input = sc.nextLine();
        String[] in = input.split("\\s+");
        int n = Integer.parseInt(in[0]);
        int p = Integer.parseInt(in[1]);
        int q = Integer.parseInt(in[2]);

        int points = p+q;
        int d = points/n;
        if(d%2==0) System.out.println("paul");
        else System.out.println("opponent");




    }

}
