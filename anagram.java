import java.util.HashMap;
public class anagram {
     public static Boolean equal(HashMap<Character,Integer>hm1,HashMap<Character,Integer>hm2){
         System.out.println(hm1);
         System.out.println(hm2);
         
         if(hm1.size()!=hm2.size()){
             return false;
         }
         for(int i:hm1.keySet()){
             if(!hm2.containsKey(i)){
                 return false;
             }
         int a=hm1.get(i);
         int b=hm2.get(i);
         if(a!=b){
             return false;
         }
         }
         return true;
    }
    public static void main(String[] args) {
        HashMap<Character,Integer>hm1=new HashMap<>();
        HashMap<Character,Integer>hm2=new HashMap<>();
        String a="rear";
        String b="rare";
        for(int i=0;i<a.length();i++){
            char temp=a.charAt(i);
            hm1.put(temp,hm1.getOrDefault(temp,0)+1);
        }
        for(int i=0;i<a.length();i++){
            char temp=a.charAt(i);
            hm2.put(temp,hm2.getOrDefault(temp,0)+1);
        }
        Boolean z=equal(hm1,hm2);
        System.out.println(z);
     /*if(z){
         System.out.println("Anagram");
     }
     else{
         System.out.println("not");
     }*/
    }
}

