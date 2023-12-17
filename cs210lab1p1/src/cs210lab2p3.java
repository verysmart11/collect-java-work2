import java.util.ArrayList;
import java.util.Scanner;

public class cs210lab2p3 {
    public static void main(String[] args) {
        Scanner zz = new Scanner(System.in);
        String j1 = zz.nextLine();
        String[] arr=j1.split(",");
        ArrayList<String> list1= new ArrayList<>();

        for(int i=0;i< arr.length;i++){
            boolean e=false;
            for(int j = 0; j <list1.size(); j++){
                if(arr[i].equals(list1.get(j)))e=true;
            }
            if(e==false)list1.add(arr[i]);
        }

        for(int j = 0; j <list1.size(); j++){
            if(j== list1.size()-1)System.out.print(list1.get(j));
            else System.out.print(list1.get(j)+" ");
        }




    }
}
