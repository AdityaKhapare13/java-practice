import java.util.*;
class Method_Overloading{
    public class S1{
        int id;
        String name;
        double num ;
    }
    public static void main(String[] args){
       S1(12,"Aditya");
       S1(45,"Aditya",9594761727L);

        
    }

    public static void S1(int id, String name ){
        System.out.println(id);
        System.out.println(name);
    }

    public static void S1(int id, String name ,long num){
        System.out.println(id);
        System.out.println(name);
        System.out.println(num);
    }
}
    