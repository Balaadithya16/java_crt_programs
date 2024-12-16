import java.util.Scanner;
public class strongnumber {
    public static int fact(int z){
        int t2=1;
        for(int i=1;i<=z;i++){
            t2=t2*i;
        }
        return t2; 
    }
    public static void main(String[] args) {144
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter a number:");
     int a=sc.nextInt();
     int b=a;
     int ans=0;
     while(a>0){
         int temp=a%10;
         ans+=fact(temp);
         a/=10;
     }
     if(ans==b){
         System.out.println("Strong number");
     }
     else{
         System.out.println(" Not an Strong number");
     }
    
}
}
