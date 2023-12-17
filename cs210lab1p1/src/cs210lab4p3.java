import java.util.Scanner;

public class cs210lab4p3 {
    public static void main(String[] args) {
        Scanner zz = new Scanner(System.in);
        String str1 = zz.nextLine();
        String[] str= str1.split(",");
        int[] arr=new int[str.length];
        for (int i = 0; i < str.length; i++) {
           arr[i]=Integer.parseInt(str[i]);
        }

        int pos=0;
        for (int i = 0; i < arr.length; i++) {
            int min=Integer.MAX_VALUE;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<min)min=arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                if(arr[j]==min)pos=j;
            }
            System.out.print("step "+i+": arr = [");
            for (int j = 0; j < arr.length; j++) {
               if(j< arr.length-1) System.out.print(arr[j]+",");
               else if(j==arr.length-1) System.out.println(arr[j]+"],and min_position = "+pos);
            }
                int temp=arr[pos];
                arr[pos]=arr[i];
                arr[i]=temp;

        }
    }
}
