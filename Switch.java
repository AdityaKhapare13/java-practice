import java.util.*;
class Switch{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int a = 12;
        int b= 23;
        String Algebra = Sc.nextLine();
        switch(Algebra)
        {
            case "+" :
            {
                System.out.println(a + b);
                break;
            }
            case "-" :
            {
                System.out.println(a - b);
                break;
            }
            case "*" :
            {
                System.out.println(a * b);
                break; 
            }
            case "/" :
            {
                 System.out.println(a / b);
                 break;
            }
            case "%" :
            { 
                System.out.println(a % b);
                break;
            }
            
        }
    }
}