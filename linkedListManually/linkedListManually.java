package linkedListManually;

class LL {

    static Node head;

  

    class Node {

        int val;
        Node next;

        public Node(int val) {
            this.val = val;

        }

        public Node() {

        }

        public Node(Node next) {
            this.next = next;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }

    public void addFirst(int val){
        Node newNode = new Node(val);
        if(head==null){
         head = newNode;
          return;
        }
        
        if(head!=null){
        newNode.next = head;
        head = newNode;
    }
    }
   public void addLast(int val){
       Node newNode = new Node(val);
       if(head== null){
           head = newNode;
       }
       Node temp = head;
       while(temp.next!=null){
         temp= temp.next;
       }
       temp.next = newNode;
       
       
       
   }

   public void deletefast(){
        head = head.next;
   }
   
   public void deleteLast(){
       Node temp = head;
       while(temp.next.next!=null){
           temp = temp.next;
       }
       temp.next=null;
   }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(0);
        list.addFirst(1);
        list.addFirst(7);
        list.addFirst(2);
         Node current = head;
       while(current!=null){
           System.out.print(current.val+" ");
           current = current.next;
       }
        System.out.println("");
       list.addLast(1);
       current = head;
        while(current!=null){
           System.out.print(current.val+" ");
           current = current.next;
       }
         list.deletefast();
        System.out.println(" ");
       
        current = head ;
        
        while(current!=null){
            System.out.print(current.val+" ");
            current = current.next;
        }
        list.deleteLast();
        System.out.println(" ");
        current = head;
        while(current!=null){
            System.out.print(current.val+" ");
            current = current.next;
        }
    }
}
