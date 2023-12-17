import  java.util.Scanner;
public class cs210lab1p2 {
    public static void main(String[] args) {
        Scanner zz = new Scanner(System.in);
        String j = zz.nextLine();
        int q = 0;
        for (int i = 0; i < j.length(); i++) {
            if (j.charAt(i) == ' ') {
                q++;
            }
        }
        int len = q;
        int max = 0;
        boolean e = false;
        int indexS = 0;
        int indexe = 0;

        int[] p = new int[q + 1];

        for (int i = 0; i < j.length(); i++) {
            if(j.charAt(i) == ' '){
                if ( len == q) {
                    indexS = indexe;
                }
                else if ( len != q) {
                    indexS = indexe + 1;
                }
                indexe = i;
                p[q] = Integer.parseInt(j.substring(indexS, indexe));
                q--;
            }
            if(q==0){
                indexS = indexe + 1;
                p[q] = Integer.parseInt(j.substring(indexS));
            }



        }

        for (int i = 0; i < p.length; i++) {
            if (Math.abs(p[i]) > Math.abs(max)) max = p[i];
        }
        System.out.println(max);
    }
}
