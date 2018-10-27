import java.util.Scanner;
public class cold{
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int erg=0;
    int value;
    int n = sc.nextInt();
    for(int i=0 ; i<n ; i++){
        
        value = sc.nextInt();
        if(value<0){
            erg++;
        }
        
    }
    System.out.println(erg);
    
    }//end main
}//end class