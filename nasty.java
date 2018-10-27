import java.util.Scanner;
public class nasty{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        String[] output = new String[n];
        sc.nextLine();
        for(int i=0;i<n;i++){
            
            arr[i] = sc.nextLine();
            String[] rech = arr[i].split("\\s+");
            int r = Integer.parseInt(rech[0]);
            int e = Integer.parseInt(rech[1]);
            int c = Integer.parseInt(rech[2]);
            
            if((e-c)>r)output[i] = "advertise";
            if((e-c)==r)output[i] = "does not matter";
            if((e-c)<r)output[i] = "do not advertise";
            
        }
        
        for(int j=0;j<n;j++){
            
            System.out.println(output[j]);
            
        }
        
    }
    
}