import java.util.*;

class addEven {
    public static void main(String[] args) {
        System.out.println("Give the number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  
        double result = isEven(a);  
        System.out.println(result);  
        sc.close();
    }

    public static double isEven(int a) {  
        if (a <= 0) {
            System.out.println("Please enter a valid positive number");
            return 0;  
        }

        double sum = 0;
        
        for (int i = 2; i <= a; i += 2) {  
            sum += i;  
        }
        return sum; 
    }
}
