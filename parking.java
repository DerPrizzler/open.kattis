import java.util.Scanner;
public class parking {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int[] output = new int[cases];
        for (int i = 0; i < cases; i++) {

            int shops = sc.nextInt();
            int[] dist = new int[shops];
            for (int j = 0; j < shops; j++) {
                 dist[j] = sc.nextInt();
            }

            //kleinste Zahl
            int klein=dist[0];
            int groeste=dist[0];
            for (int j = 0; j < shops; j++) {
                if(klein<dist[j])klein = dist[j];
                if(groeste>dist[j])groeste=dist[j];
            }

            int erg = (groeste-klein)*2;
            output[i] = -erg;

        }//end for

        for (int u = 0; u < cases; u++) {
            System.out.println(output[u]);
        }

    }

}
