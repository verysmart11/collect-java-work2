import java.util.Scanner;

public class cs210lab3p1 {
    public static void main(String[] args) {
        Scanner zz = new Scanner(System.in);
        String z= zz.nextLine();
        int a= zz.nextInt();
        String[] z1=z.split(",");
        int[] a1= new int[z1.length];
        for (int i = 0; i < z1.length; i++) {
            a1[i]=Integer.parseInt(z1[i]);
        }

        boolean flag1=false;
        int lenmax=0;

            for (int i = 0; i < a1.length; i++) {
                int sum=0;
                int index=0;
                boolean flag2=false;
                for (int j = i; j < a1.length; j++) {
                    sum+=a1[j];
                    if(sum==a){
                        index=j;
                        flag1=true;
                        flag2=true;
                    }
                    else flag2=false;

                    if(flag2==true){
                        if(lenmax<index-i+1){
                            lenmax=index-i+1;
                        }
                    }
                }


        }


        for (int i = 0; i < a1.length; i++) {
            int sum=0;
            int index=0;
            boolean flag2=false;
            for (int j = i; j < a1.length; j++) {
                sum+=a1[j];
                if(sum==a){
                    index=j;
                    flag1=true;
                    flag2=true;
                }
                else flag2=false;

                if(flag2==true && lenmax==(index-i+1)){

                        int[] arr=new int [lenmax];
                    System.out.print("{");
                        for (int q = i; q < index+1; q++) {
                           if(q<index) System.out.print(a1[q]+",");
                           else System.out.println(a1[q]+"}");
                        }

                }
            }


        }

        if(flag1==false) System.out.println("Not found");
        else System.out.println(lenmax);
    }
}
