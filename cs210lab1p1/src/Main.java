// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner zz=new Scanner(System.in);
        String sr=zz.next();
        int i=0;

             i=Integer.parseInt(sr);


        if(i>0&&i<Math.pow(2,31)-1){
            String t=sr.substring(sr.length()-1);
            for(int j=sr.length()-1;j>0;j--){
                t+=sr.substring(j-1,j);
            }
            System.out.println(t);
        }
        else if(i<0&&i>-Math.pow(2,31)){
            String t="-"+sr.substring(sr.length()-1);
            for(int j=sr.length()-1;j>1;j--){
                t+=sr.substring(j-1,j);
            }
            System.out.println(t);
        }
        else  System.out.println("0");





    }
}