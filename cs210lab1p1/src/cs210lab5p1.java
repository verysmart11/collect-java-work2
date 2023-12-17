import java.util.Scanner;

public class cs210lab5p1 {
    public static void main(String[] args) {
        Scanner zz = new Scanner(System.in);
        String str1 = zz.nextLine();
        String[] str = str1.split(",");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i])max=arr[i];
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
            int temp=arr[pos];
            arr[pos]=arr[i];
            arr[i]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==max) {
                if(i!=0) System.out.println(arr[i-1]);
                else System.out.println("No second largest number found in the given array");
                break;
            }


        }
    }
    }
