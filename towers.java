import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class towers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> output =new ArrayList<>();
        List<Long> rechner = new ArrayList<>();
        String s = sc.nextLine();
        List<Integer> index = new ArrayList<>();
        String[] input = s.split("\\s+");
        String[] line = new String[Integer.parseInt(input[0])];
        for (int i = 0; i < Integer.parseInt(input[0]); i++) {

            s=sc.nextLine();
            //BACKUP
            String backup =s;
            output.add(backup);
            Double erg=0.0;
            Long n;
            if(s.contains("^")){
                index.add(i);
                s = s.replace("^","");
                char[] c = s.toCharArray();
                erg = Double.parseDouble(String.valueOf(c[0]));
                for (int j = 1; j < c.length; j++) {
                    s = String.valueOf(c[j]);
                    n = Long.parseLong(s);
                    erg = Math.pow(erg,n);
                }
                n = erg.longValue();
            }else n = Long.parseLong(s);
            rechner.add(n);
            line[i] = 

        }
        /**
         * COMPARISON AND OUTPUT NEEDS SOME WORK
         */

        index.forEach(System.out::println);
        Collections.sort(rechner);
        rechner.forEach(System.out::println);

        
    }

}
