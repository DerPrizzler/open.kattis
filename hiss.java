import java.util.Scanner;
public class hiss {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 2;
        int erg= start+start-1;
        for (int i = 0; i < n-1; i++) {

            erg = erg+erg-1;

        }
        erg = erg*erg;
        System.out.println(erg);

    }

}
