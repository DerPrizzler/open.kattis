
import java.util.Scanner;
public class seed {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        int anz = sc.nextInt();
        sc.nextLine();
        double erg=0;
        for (int i = 0; i < anz; i++) {

            String input = sc.nextLine();
            String[] inp = input.split("\\s+");
            double w = Double.parseDouble(inp[0]);
            double l = Double.parseDouble(inp[1]);
            erg = erg + (w*l);

        }

        erg = erg*c;
        System.out.println(String.format("%.7f",erg));

    }

}
