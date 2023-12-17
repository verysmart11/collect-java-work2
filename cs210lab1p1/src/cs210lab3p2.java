import java.util.Scanner;

public class cs210lab3p2 {
    public static void main(String[] args) {
        Scanner zz = new Scanner(System.in);
        String z= zz.nextLine();
        int a= zz.nextInt();
        String[] z1=z.split(",");
        int[] a1= new int[z1.length];
        for (int i = 0; i < z1.length; i++) {
            a1[i]=Integer.parseInt(z1[i]);
        }

        for (int i = 0; i < a1.length; i++) {
            for (int j = i; j < a1.length; j++) {
                if(a1[j]==a&&j!=a1.length-1){
                    int temp=a1[j];
                    a1[j]=a1[j+1];
                    a1[j+1]=temp;
                }
            }
        }

        for (int i = 0; i < a1.length; i++) {
           if(i< a1.length-1) System.out.print(a1[i]+",");
           else System.out.print(a1[i]);
        }

    }
}
