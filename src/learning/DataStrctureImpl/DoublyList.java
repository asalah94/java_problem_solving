package learning.DataStrctureImpl;

public class DoublyList {
    DoublyNode  head = null;
    DoublyNode tail = null;
    int length;
    public void insertFirst(int item){
        DoublyNode newnode = new DoublyNode();
        newnode.data = item;
        if(head == null && tail == null){
            head = tail =  newnode;
            newnode.next = newnode.Previous = null;
        }
        else{
            newnode.next = head;
            newnode.Previous = null;
            head.Previous = newnode;
            head = newnode;

        }

        length++;

    }

    public void insertLast(int item){
        DoublyNode newnode = new DoublyNode();
        newnode.data = item;
        if(head == null && tail == null){
            head = tail =  newnode;
            newnode.next = newnode.Previous = null;
        }
        else{
           newnode.next = null;
           newnode.Previous = tail;
           tail.next = newnode;
           tail = newnode;

        }

        length++;

    }

    public void insertAtPos(int pos, int item){
        if(pos < 0 || pos > length){
            System.out.println("out of range");
        }
        else{
            DoublyNode newnode = new DoublyNode();
            newnode.data = item;
            if(pos ==0){
                insertFirst(item);
            }
            else if(pos == length){
                insertLast(item);
            }
            else{
                DoublyNode curr = head;
                for(int i = 1; i < pos ; i++){
                    curr = curr.next;
                }
                newnode.next = curr.next;
                newnode.Previous = curr;
                curr.next = newnode;
                curr.next.Previous = newnode;
            }
            length++;
        }
    }

    public  void removeFirst(){
        if (length == 0){
            System.out.println("empty list");
        }
        else if(length ==1){
            head = tail = null;

        }
        else {
            head = head.next;
            head.Previous = null;
        }
        length --;
    }

     public void removeLst(){
         if (length == 0){
             System.out.println("empty list");
         }
         else if(length ==1){
             head = tail = null;

         }
         else {
           tail =  tail.Previous;
           tail.next = null;
         }
         length --;
     }

     public void removeItem(int item){
         if (length == 0){
             System.out.println("empty list");
         }
         else if(head.data == item){
             removeFirst();
         }
         else {
           DoublyNode curr = head.next;
           while (curr != null && curr.data != item){
               curr = curr.next;
           }
           if (curr == null){
               System.out.println("element not found");

           }
           else if(curr.next == null){
               removeLst();
           }
           else{
                   curr.Previous.next = curr.next;
                   curr.next.Previous = curr.Previous;
           }
           length --;

         }



     }
     void display(){
        DoublyNode curr  = head;
        while (curr!= null){
            System.out.println(curr.data);
            curr = curr.next;
        }
     }
    void reverseDisplay(){
        DoublyNode curr  = tail;
        while (curr!= null){
            System.out.println(curr.data);
            curr = curr.Previous;
        }
    }

    public static void main(String[] args) {
        DoublyList list = new DoublyList();
        list.insertFirst(1);
        list.insertFirst(6);
        list.insertFirst(2);
        list.insertLast(3);
        list.insertAtPos(0,5);
        list.removeItem(6);
        list.display();
        list.reverseDisplay();

        //list.reverseDisplay();
       // list.reverseDisplay();
    }


}
