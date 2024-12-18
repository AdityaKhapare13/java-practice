import java.util.*;
class PrimeAdd{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Give the number: ");
        int num = Sc.nextInt();
        int isPrime =Prime(num);
        int digitSum = 0;
        if (isPrime == 1) {
            int temp = num;  
            while (temp != 0) {
                int digit = temp % 10;
                digitSum += digit;
                temp = temp / 10;  
            }
            System.out.println("Sum of digits is: "+digitSum);
        }
        else{
            System.out.println("number is not a prime number");
        }
        Sc.close();

        
    }

    public static int Prime(int b){
        if(b <= 1){
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(b); i++) {
            if (b % i == 0) {
                return 0; 
            }
        }
        return 1;


    }
}