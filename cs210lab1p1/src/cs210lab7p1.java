import java.util.Scanner;

public class cs210lab7p1 {
    public static void main(String[] args) {
        Scanner zz = new Scanner(System.in);
        String jj = zz.nextLine();
        int m=zz.nextInt();
        int b=zz.nextInt();
        int e=zz.nextInt();
        String[] arr = jj.split(",");
        int[] arrInt = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }

        if(e-b>=m-1) {

            for (int i = b; i < e; i = i + m) {
                int[] arr1 = new int[m];
                for (int j = 0; j < m; j++) {
                    arr1[j] = arrInt[i + j];
                }
                for (int j = 0; j < m; j++) {
                    arrInt[i + m - j - 1] = arr1[j];
                }

            }
        }

        for (int i = 0; i < arrInt.length; i++) {
            if(i< arrInt.length-1)System.out.print(arrInt[i]+",");
            else {
                System.out.println(arrInt[i]);
            }
        }
    }
}
