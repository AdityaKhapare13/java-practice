import java.util.Scanner;

class demo {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Give the number: ");
        int a = Sc.nextInt();
        
        // Check if the number is prime
        int isPrime = Prime(a);
        
        // Initialize the variable to store the sum of digits
        int digitSum = 0;
        
        // If the number is prime, sum its digits
        if (isPrime == 1) {
            int temp = a;  // Store original value of a
            while (temp != 0) {
                int digit = temp % 10;
                digitSum += digit;
                temp = temp / 10;  // Update temp to remove the last digit
            }
        } else {
            digitSum = -1;  // Or any message indicating that the number is not prime
        }
        
        // Output the result
        if (digitSum != -1) {
            System.out.println("Sum of digits: " + digitSum);
        } else {
            System.out.println("The number is not prime, no sum.");
        }
    }

    // Function to check if a number is prime
    public static int Prime(int b) {
        if (b <= 1) {
            return 0;  // 1 or less is not prime
        }
        for (int i = 2; i <= Math.sqrt(b); i++) {
            if (b % i == 0) {
                return 0;  // Not prime if divisible by any number other than 1 and itself
            }
        }
        return 1;  // Prime if no divisors found
    }
}
