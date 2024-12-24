import java.util.*;
class C1{
    private static C1 obj3;
        int id;
        String name;
        public static void main(String[] args){
            
            C1.obj3 = new C1(10, "Aditya");

        
    }
    C1(int id ){
        this.id = 18;
    }
    C1(int id ,String name){
        this(id);
        this.name = "Akash";
        System.out.println(this.id+"  "+this.name);
    }
}