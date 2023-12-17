import java.util.Scanner;

public class cs210lab6p3 {
    public static void main(String[] args) {
        Scanner zz = new Scanner(System.in);
        String j = zz.nextLine();
        int n=zz.nextInt();
        String[] arr = j.split(",");
        int[] arrInt=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrInt[i]=Integer.parseInt(arr[i]);
        }
        int count=0;
        int maxlen=0;
        int len=0;
        int maxPoint=0;
        int minPoint=0;
        int point=0;

        for (int i = 0; i <arrInt.length ; i++) {
            count=0;
            for (int k = i; k >=0; k--) {
                if(arrInt[k]==0)count++;
                if(count==n||k==0&& count<n){
                    point=k;
                    len=i-k;
                }
            }
            if(maxlen<len){
                maxPoint=i;
                minPoint=point;
                maxlen=len;
            }

        }

        for (int i = 0; i <arrInt.length; i++) {
            if(i<=maxlen&&i>=minPoint)arrInt[i]=1;
        }

        System.out.println("The length of longest sequence is "+(maxlen+1)+" (from index "+minPoint+" to index "+ maxPoint+")");
        System.out.print("[");
        for (int i = 0; i <arrInt.length; i++) {
            if(i<arrInt.length-1) System.out.print(arrInt[i]+",");
            else System.out.println(arrInt[i]+"]");
        }



    }
}
