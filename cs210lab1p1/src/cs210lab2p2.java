import java.util.Scanner;

public class cs210lab2p2 {
    public static void main(String[] args) {
        Scanner zz = new Scanner(System.in);
        String j1 = zz.nextLine();
        String j2 = zz.nextLine();
        String[] arr1=j1.split(",");
        String[] arr2=j2.split(",");
        String[] arr=new String[arr1.length+ arr2.length];
        for(int i=0;i<arr.length;i++){
            if(i<arr1.length){
                arr[i]=arr1[i];
            }
            else {
                arr[i]=arr2[i- arr1.length];
            }
        }

        int[] arry=new int[arr.length] ;
        for(int i=0;i<arr.length;i++){
            arry[i]=Integer.parseInt(arr[i]);
        }

        for(int pass=1;pass< arry.length;pass++){
            for(int j=0;j<arry.length-1;j++){
                int temp=0;
                if(arry[j]>arry[j+1]){
                    temp=arry[j];
                    arry[j]=arry[j+1];
                    arry[j+1]=temp;

                }
            }
        }

        for(int i=0;i<arry.length;i++){
            if(i==arry.length-1)System.out.print(arry[i]);
            else System.out.print(arry[i]+",");
        }





    }

}
