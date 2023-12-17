import java.util.Scanner;

public class cs210lab4p1 {
    public static void main(String[] args) {
        Scanner zz = new Scanner(System.in);
        double num1 = zz.nextDouble();
        long num2 = zz.nextLong();
        double sum=1;

        if(num2==0){
            sum=1;
        }
        else if(num2>0){
            for (long i = 1; i <=num2; i++) {
                sum*=num1;
            }
        }
        else if(num2<0){
            for (long i = 1; i <=-num2; i++) {
                sum/=num1;
            }
        }
        System.out.println(sum);
    }
}
