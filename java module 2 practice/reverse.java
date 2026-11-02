import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter numbers you want to reverse");
    int num= sc.nextInt();
    
    int reverse = 0;
    int n= 0 ;
    int digit;
    while(num>0){
        digit = num % 10;
        reverse = (reverse*10)+digit;
        num /= 10;
    }   
    System.out.println(reverse);
    }
}
