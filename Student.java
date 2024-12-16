import java.util.Scanner;
class Student{
     int roll;
    String name;
    Student(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
    void print(){
        System.out.println("Name:"+name);
        System.out.println("roll no:"+roll);
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        Student[] arr=new Student[n];
        for(int i=0;i<n;i++){
            int rolls=sc.nextInt();
            String names=sc.next();
            arr[i]=new Student(rolls,names);
        }
        for(Student i:arr){
            i.print();
        }
        }
    }

