import java.util.*;
class if_else{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        if(a <= 18){
            System.out.println("Not eligible to vote");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }
}