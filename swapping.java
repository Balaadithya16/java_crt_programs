import java.util.Scanner;
public class swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           System.out.print("Enter size:");
           int n=sc.nextInt();
           int arr[]=new int[n];
           int t1=0;
           int t2=0;
           for(int i=0;i<n;i++){
               System.out.print("Enter a["+i+"] Element:");
               arr[i]=sc.nextInt();
           }
         System.out.print("Enter the choice p or e:");
         char c=sc.next().charAt(0);
    if(c=='e'){
        System.out.print("Enter 1st swap number:");
         int a=sc.nextInt();
         System.out.print("Enter 2nd swap number:");
         int b=sc.nextInt();
         for(int i=0;i<n;i++){
            if(arr[i]==a){
                t1=i;
            }
            if(arr[i]==b){
                t2=i;
            }
         }
         int t3=arr[t1];
          arr[t1]=arr[t2];
          arr[t2]=t3;
       for(int i:arr){
           System.out.print(i+" ");
       }
    }
    else
    {
        System.out.print("Enter 1st position:");
         int a=sc.nextInt();
         System.out.print("Enter 2nd position:");
         int b=sc.nextInt();
         int t3=arr[a];
          arr[a]=arr[b];
          arr[b]=t3;
       for(int i:arr){
           System.out.print(i+" ");
       }
    }
    }
    
}
