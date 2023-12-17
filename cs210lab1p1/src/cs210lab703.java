import java.util.Scanner;

public class cs210lab703 {
    public static void main(String[] args) {
        Scanner zz = new Scanner(System.in);
        String j = zz.next();
        String[] arrS = j.split(",");
        int n=(int)Math.sqrt(arrS.length);
        int[][] m=new int[(int)Math.sqrt(arrS.length)][(int)Math.sqrt(arrS.length)];
        int count=0;
        for (int i = 0; i <n ; i++) {
            for (int k = 0; k < n; k++) {
                m[i][k]= Integer.parseInt(arrS[count]);
                count++;
            }
        }
        System.out.println(lowest(m,n-1,n-1));
    }

    public static int lowest(int[][] m,int i,int j){
        if(i==0&&j==0) return  m[0][0];
        else if(i==0) return m[i][j]+lowest(m,i,j-1);
        else if (j==0) return m[i][j]+lowest(m,i-1,j);
        else {
            if(m[i-1][j]<m[i][j-1])return m[i][j]+lowest(m,i-1,j);
            else return m[i][j]+lowest(m,i,j-1);
        }
    }
}
