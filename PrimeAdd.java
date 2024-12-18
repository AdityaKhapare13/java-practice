import java.util.Scanner;
class PrimeAdd{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Give the number : ");
        int a = Sc.nextInt();
        int d =Prime(a);
        int rev = 0;
        if (d == 1){
            while(a != 0){
                int digit = a % 10;
                rev = digit + rev;
                
            }
        }
        System.out.println(rev);
        //int m = add(d,a);
        //System.out.println(m);




    }
    public static int Prime(int b){
        int c = b;
        int n = 0;
        for (int i = 2; i == c; i++){
            if (c%i== 0){
                n= 1;
            }
            else{
                n = 0;
            }
        }
        return n;
    }

    /*public static int add(int e,int f){
        int j=0;
        
        if(e==1){
            int rev = 0;
            while(f != 0){
                int digit = f % 10;
                rev = digit + rev;
                
            }
            j = rev;
            
        }
        else{
            j= 0;
        }
        return j;

    }*/
}