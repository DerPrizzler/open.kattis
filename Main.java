import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

            int h ,v;
            Scanner sc = new Scanner(System.in);

            h = sc.nextInt();
            v = sc.nextInt();
            //Winkel Alpha berechnen
            double winkelalpha = (double)v;
            winkelalpha = winkelalpha * Math.PI /180;
            double erg = h / Math.sin(winkelalpha);
            int ausgabe = (int) Math.ceil(erg);
            System.out.println(ausgabe);


    }
}