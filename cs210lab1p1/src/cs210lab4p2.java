import java.util.Scanner;

public class cs210lab4p2 {
    public static void main(String[] args) {
        Scanner zz = new Scanner(System.in);
        String str1 = zz.nextLine();
        String str2 = zz.nextLine();

        String[] arr=str1.split(",");
        String[] pos=str2.split(",");

        for (int i = 0; i < arr.length; i++) {
            if(i< arr.length-1) System.out.print(arr[Integer.parseInt(pos[i])]+",");
            else if(i== arr.length-1) System.out.println(arr[Integer.parseInt(pos[i])]);
        }

    }
}
