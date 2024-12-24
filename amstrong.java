import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        System.out.println("enter your number ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int org_num = num; 
        int sum =0;
        while(num>1){
            int i = 0;
            i = num%10;
            sum=sum+i*i*i;
            num=num/10;
        }
        if(org_num==sum){
            System.out.println("given number is amstrong.");
        }
        else{
            System.out.println("given number is not amastrong.");
        }
    }
}
