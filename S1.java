import java.util.*;
class S1{
        int id;
        String name;
        long num ;
    
    
       
    
    public static void main(String[] args){


       S2 obj1 = new S2();
        obj1.id= 78;
        obj1.name = "Akash";
        obj1.num= 9321469077L;

        S2 obj2 = new S2();
            obj2.id = 45;
            obj2.name ="Nikhil";
            obj2.num = 9869242708L;

            obj1.m1();
            obj2.m1();

        
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
 class S2{
    int id;
    String name;
    long num ;
    public void m1(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.num);
}
}
    