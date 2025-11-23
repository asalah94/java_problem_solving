package learning.DataStrctureImpl;

public class stackLinkedList {

    Node top;

    public stackLinkedList() {
        top = null;
    }
    void push(int newItem){

        Node newItemPtr = new Node() ;
        newItemPtr.data  = newItem;
        newItemPtr.next = top;
        top = newItemPtr;
    }


    void pop(){
     if (top == null){
         System.out.println("stack is empty");
     }
     else {
           Node temp =top;
           top = top.next;
           temp.next = null;
     }
    }
     void display(){
        while (top != null){
            System.out.println(top.data);
            top = top.next;
        }
     }

    public static void main(String[] args) {
        stackLinkedList stack =  new stackLinkedList();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.display();

    }
}
