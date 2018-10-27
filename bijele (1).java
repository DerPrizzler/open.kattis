import java.util.Scanner;
public class bijele {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] work = input.split("\\s+");
        int king=Integer.parseInt(work[0]);
        int queen=Integer.parseInt(work[1]);
        int rooks=Integer.parseInt(work[2]);
        int bishops=Integer.parseInt(work[3]);
        int knigths=Integer.parseInt(work[4]);
        int pawns=Integer.parseInt(work[5]);

        int addking,addqueen,addrooks,addbishops,addknights,addpawns;

        if(king==0)addking=1;
        else addking = -king + 1;

        if(queen==0)addqueen=1;
        else addqueen = -queen + 1;

        if(rooks==0)addrooks=2;
        else addrooks = -rooks + 2;

        if(bishops==0)addbishops=2;
        else addbishops = -bishops + 2;

        if(knigths==0)addknights=2;
        else addknights = -knigths + 2;

        if(pawns==0)addpawns=8;
        else addpawns = -pawns + 8;

        System.out.println(addking+" "+addqueen+" "+addrooks+" "+addbishops+" "+addknights+" "+addpawns);


    }



}
