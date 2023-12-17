import java.util.Scanner;

public class cs210lab7p2 {
    public static void main(String[] args) {
        Scanner zz = new Scanner(System.in);
        String jj = zz.nextLine();
        int n = zz.nextInt();
        String[] arr = jj.split(",");
        int[] arrInt = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }

        int mid=0;
        int min=0;
        int max=arrInt.length-1;
        boolean e=false;
        int temps=0;
        int tempe=0;
        if(arrInt[0]>n) {
            System.out.println("-999,"+arrInt[0]);
            e=true;
        }
        else if (arrInt[arrInt.length-1]<n) {
            System.out.println(arrInt[arrInt.length - 1] + ",-999");
            e=true;
        }
        while (min<=max){
            mid=(min+max)/2;
            if(arrInt[mid]<n){
                min=mid;
            }
            else if(arrInt[mid]>n){
                max=mid;
            }

            if(arrInt[mid]==n||arrInt[min]==n||arrInt[max]==n){
                System.out.println(n+","+n);
                e=true;
                break;
            } else if (min+1==max) {
              temps=max;
              tempe=min;
              break;
            }

        }

       if(e==false){
           System.out.println(arrInt[tempe]+","+arrInt[temps]);
       }
    }
}
