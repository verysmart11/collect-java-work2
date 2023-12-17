import java.util.Scanner;

public class cs210lab5p2 {
    public static void main(String[] args) {
        Scanner zz = new Scanner(System.in);
        String str1 = zz.nextLine();
        String str2 = zz.nextLine();
        String[] str3 = str1.split(",");
        String[] str4 = str2.split(",");
        int[] X = new int[str3.length+str4.length];
        int[] Y = new int[str4.length];
        for (int i = 0; i < str4.length; i++) {
            Y[i] = Integer.parseInt(str4[i]);

        }

        for (int i = 0; i <(str3.length+str4.length); i++) {
            if(i<str3.length){
                    X[i] = Integer.parseInt(str3[i]);
            }
            else {
                    X[i] = Y[i-str3.length];
            }
        }


        int max=Integer.MIN_VALUE;
        for (int i = 0; i < X.length; i++) {
            if(max<X[i])max=X[i];
        }
        int pos=0;
        for (int i = 0; i < X.length; i++) {
            int min=Integer.MAX_VALUE;
            for (int j = i; j < X.length; j++) {
                if(X[j]<min)min=X[j];
            }
            for (int j = i; j < X.length; j++) {
                if(X[j]==min)pos=j;
            }
            int temp=X[pos];
            X[pos]=X[i];
            X[i]=temp;
        }


        for (int i = 0; i < X.length; i++) {

            if(X[i]!=0){
                if(i<X.length-1 ) System.out.print(X[i]+",");
                else System.out.print(X[i]);
            }

        }
    }
}
