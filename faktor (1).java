import java.util.Scanner;
public class faktor {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] work = input.split("\\s+");
        int a = Integer.parseInt(work[0]);
        int b = Integer.parseInt(work[1]);
        int erg = (a*b)-a+1;
        System.out.println(erg);




    }

}
