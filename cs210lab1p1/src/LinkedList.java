public class LinkedList {
    private LinkNode head =new LinkNode("");
    public  LinkNode getHead(){
        return head;
    }
    public void addLinkNode(LinkNode linkNode){
        LinkNode temp = head;
        while (true){
            if(temp.next==null){
                break;
            }
            temp=temp.next;
        }
        temp.next=linkNode;
    }
    public void ifEmpty(LinkNode head){
        if(head.next==null){
            System.out.println("The link is empty");
        }
        else System.out.println("The link is not empty");
    }

    public void showLinkList(){
        LinkNode temp =head.next;
        while (true){
            if(temp!=null){
                temp.showLinkNode();
                temp=temp.next;
            }else break;
        }
    }

    public void updateLinkLidt(LinkNode linkNode){

    }

    private LinkNode reverseLinkList1(LinkNode l){
        LinkNode result=null;
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
