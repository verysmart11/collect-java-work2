import java.util.Scanner;

public class cs210lab2p1 {
    public static void main(String[] args) {
        Scanner zz = new Scanner(System.in);
        String j = zz.nextLine();
        String[] arr=j.split(",");
        int[] arr1=new int[arr.length] ;
        for(int i=0;i<arr.length;i++){
            arr1[i]=Integer.parseInt(arr[i]);
        }
        int q=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr1[i]-arr1[i+1])<q){
                q=Math.abs(arr1[i]-arr1[i+1]);
            }
        }
        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr1[i]-arr1[i+1])==q){
                System.out.println("Pair found at index "+i+" and "+(i+1));
            }
        }



    }
}
