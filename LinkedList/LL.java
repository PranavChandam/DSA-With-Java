
public class LL {
    Node head;
    class Node{
        String data;
        Node next;
    
     Node(String data){
       this.data=data;
       this.next=null;
     }
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
           head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
           head=newNode;
            return;
        }
        Node curNode=head;
        while (curNode.next!=null) {
            curNode=curNode.next;

        }
        curNode.next=newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node curNode=head;
        while (curNode!=null) {
            System.out.print(curNode.data+"->");
            curNode=curNode.next;
        }
        System.out.println();
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public static void main(String args[]){
      LL list=new LL();
      list.addFirst("A");
      list.addFirst("is");
      list.addFirst("This");
      list.printList();
     
      list.addLast("List");
      list.printList();
      
      list.deleteFirst();
      list.printList();

      list.deleteLast();
      list.printList();

    }
}
