package learning.DataStrctureImpl;

public class LinkedList {
    int length;
    Node head;
    Node tail;
    Node curr;
    Node previous;
    Node next;

    public LinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    public void insertFirst(int item){

        Node newNode = new Node();
        newNode.data = item;
        if(length == 0){
            head = tail = newNode;
            newNode.next = null;
        }
        else{
            newNode.next = head;
            head = newNode;

        }
        length = length+1;


    }

    boolean isEmpty(){
        return length == 0;
    }
    public void insertEnd(int item){

        Node newNode = new Node();
        newNode.data = item;
        if(length == 0){
            head = tail = newNode;
            newNode.next = null;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            newNode.next = null;

        }
        length = length+1;

    }
    void insertAtPosition(int pos , int item){
        Node newNode = new Node();
        if (pos<0 || pos > length){
            System.out.println("out of range");
        }
        else if(pos == 0){
            insertFirst(item);
        }
        else if(pos == length){
            insertEnd(item);
        }
        else{
         curr = head;
         for(int i =0 ; i< pos-1 ; i++){
             curr = curr.next;
         }
         newNode.next = curr.next;
         newNode.data = item;
         curr.next = newNode;
        }
        length++;
    }

    void print(){
        curr = head;
        while (curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    void search(int element){
        curr = head;
        int pos = 0;
        while (curr != null ) {
            if (curr.data == element){
                System.out.println(pos) ;
                break;
                }
         else{
                curr = curr.next;
                pos = pos +1;
            }
        }



    }


    void remove(int element){
        if(isEmpty()){
            System.out.println("list is empty");
        }
        else {
            if(head.data == element){
                curr = head;
                head = head.next;
                curr.next = null;
                length = length--;
            }
            else {
                curr = curr.next;
                previous = curr;
                while (curr!=null && curr.data != element){
                    previous = curr;
                    curr = curr.next;
                    if(curr ==null){
                        System.out.println("not found");
                    }
                    else{
                        previous.next = curr.next;
                        if(tail == curr){
                            tail = previous;
                            length--;
                        }
                    }
                }
            }
        }

    }

    void deleteLast(){
        curr = head.next;
        previous = head;
        while (curr != tail){
            previous = curr;
            curr = curr.next;
        }
        tail = previous;
        previous.next = null;
        length--;
    }

    void deleteFirst(){
        if(length ==0) {
            System.out.println("empty list");

        }
        else if(length ==1){
            head = null;
            tail = null;
            length = length -1;
        }
        else{
            curr = head;
            head= head.next;
            curr.next = null;
            length = length -1;
        }
    }

    public void reverse(){
      previous = null;
      curr = head;
      next = curr.next;
      while (next != null){
          next = curr.next;
          curr.next = previous;
          previous = curr;
          curr = next;
      }
      head = previous;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
//        list.insertEnd(400);
//        list.insertAtPosition(2,700);
       // list.deleteLast();
      //  list.remove(333);
//
        list.search(1);
    }

}
