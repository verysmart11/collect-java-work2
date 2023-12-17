import java.util.Scanner;

public class cs210lab6p11 {
    public static void main(String[] args) {
        Scanner zz = new Scanner(System.in);
        String j = zz.nextLine();
        boolean flag = true;
        LinkedList1 list =new LinkedList1();

        for (int i = 0; i < j.length(); i++) {
            LinkNode1 node=new LinkNode1(String.valueOf(j.charAt(i)));
            list.addLinkNode(node);
        }
        LinkedList1 listb=new LinkedList1();
        for (int i = 0; i < j.length(); i++) {
            LinkNode1 node=new LinkNode1(String.valueOf(j.charAt(i)));
            listb.addLinkNode(node);
        }
        listb.reverseLinkList();
        listb.showLinkList();

        LinkNode1 temp1 =list.getHead().next;
        LinkNode1 temp2 =listb.getHead().next;

        while (true){
            if(temp2!=null){
                if(temp2.s.equals(temp1.s)){
                    System.out.print("2");
                    temp2.showLinkNode();
                    System.out.print("1");
                    temp1.showLinkNode();
                    temp1=temp1.next;
                    temp2=temp2.next;

                }else {

                    System.out.print("2");
                    temp2.showLinkNode();
                    System.out.print("1");
                    temp1.showLinkNode();
                    flag=false;
                    break;
                }
            }
            else break;
        }

        if(flag==true) System.out.println("The word formed by the letters in the linked list is a palindrome.");
        else System.out.println("The word formed by the letters in the linked list is NOT a palindrome.");
    }
}

 class LinkedList1 {
    private LinkNode1 head =new LinkNode1("");
    public  LinkNode1 getHead(){
        return head;
    }
    public void addLinkNode(LinkNode1 linkNode){
        LinkNode1 temp = head;
        while (true){
            if(temp.next==null){
                break;
            }
            temp=temp.next;
        }
        temp.next=linkNode;
    }
    public void ifEmpty(LinkNode1 head){
        if(head.next==null){
            System.out.println("The link is empty");
        }
        else System.out.println("The link is not empty");
    }

    public void showLinkList(){
        LinkNode1 temp =head.next;
        while (true){
            if(temp!=null){
                temp.showLinkNode();
                temp=temp.next;
            }else break;
        }
    }

    public void updateLinkLidt(LinkNode1 linkNode){

    }

    private LinkNode1 reverseLinkList1(LinkNode1 l){
        LinkNode1 result=null;
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

 class LinkNode1 {
    public String s;
    public LinkNode1 next;

    public LinkNode1(String s){
        super();
        this.s=s;
    }

    public void showLinkNode(){
        System.out.println(s);
    }

}
