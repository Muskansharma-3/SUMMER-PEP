import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        if(isPrime(num)){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
        sc.close();
    }
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2;i < Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
