import java.util.Scanner;

public class is_prime {
    public static void main(String[] args) {
        System.out.println("enter your number ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int count = 0;
        if(num>1){
            for(int i=1; i<=num; i++){
                if(num%i==0)
                count++;
            }
            if(count==2){
                System.out.println("is prime.");
            }
            else{
                System.out.println("is not prime.");
            }
        }
        else{
            System.out.println("is not prime.");
        }
    }   
}
