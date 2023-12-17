import java.util.Scanner;

public class cs210lab6p2 {
    public static void main(String[] args) {
        Scanner zz = new Scanner(System.in);
        String j = zz.nextLine();
        String[] arr = j.split(",");
        LinkedList2 list=new LinkedList2();
        for (int i = 0; i < arr.length; i++) {
            LinkNoed2 node= new LinkNoed2(arr[i]);
            list.addLinkNoed2(node);
        }
        LinkNoed2 s=list.getHead();
        LinkNoed2 f=list.getHead();
        while (true){
            if(f==null||f.next==null){
                s.showLinkNoed2();
                break;
            }
            f=f.next.next;
            s=s.next;
        }


    }
}

class LinkedList2 {
    private LinkNoed2 head =new LinkNoed2("");
    public  LinkNoed2 getHead(){
        return head;
    }
    public void addLinkNoed2(LinkNoed2 LinkNoed2){
        LinkNoed2 temp = head;
        while (true){
            if(temp.next==null){
                break;
            }
            temp=temp.next;
        }
        temp.next=LinkNoed2;
    }
    public void ifEmpty(LinkNoed2 head){
        if(head.next==null){
            System.out.println("The link is empty");
        }
        else System.out.println("The link is not empty");
    }

    public void showLinkList(){
        LinkNoed2 temp =head.next;
        while (true){
            if(temp!=null){
                temp.showLinkNoed2();
                temp=temp.next;
            }else break;
        }
    }

    public void updateLinkLidt(LinkNoed2 LinkNoed2){

    }

    private LinkNoed2 reverseLinkList1(LinkNoed2 l){
        LinkNoed2 result=null;
        if(l.next.next!=null){
            result=reverseLinkList1(l.next);
        } else  {
            result=l.next;
        }
        l.next.next=l;
        l.next=null;
        return  result;

    }

    public  void reverseLinkList() {
        head.next=reverseLinkList1(head.next);
    }
}

class LinkNoed2 {
    public String s;
    public LinkNoed2 next;

    public LinkNoed2(String s){
        super();
        this.s=s;
    }

    public void showLinkNoed2(){
        System.out.println(s);
    }

}
