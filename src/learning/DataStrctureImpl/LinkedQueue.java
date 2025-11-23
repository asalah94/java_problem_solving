package learning.DataStrctureImpl;

public class LinkedQueue {


    Node frontPtr;
    Node rearPrt;
    int length;

    public LinkedQueue() {
        frontPtr = rearPrt = null;
        length = 0;
    }

    boolean isEmpty(){
        if (rearPrt == null){
            return true;
        }
        else {
            return false;
        }
    }
    void enqueue(int Element){

        if(isEmpty()){
            frontPtr = new Node();
            frontPtr.data = Element;
            frontPtr.next = null;
            rearPrt = frontPtr;
            length++;

        }

        else{
            Node newPtr = new Node() ;
            newPtr.data = Element;
            newPtr.next = null;
            rearPrt.next = newPtr;
            rearPrt = newPtr;
            length++;
        }


    }
    public void dequeue(){

        if (isEmpty()){
            System.out.println("queue is empty");
        }
        else{
            Node tempPtr = new Node() ;
            if(frontPtr==rearPrt){
                frontPtr = null;
                rearPrt = null;
                length--;
            }
            else{
                frontPtr= frontPtr.next;
                tempPtr.next = null;
                length--;
            }

        }
    }
    void clearQueue(){
        Node current = new Node();
        while (frontPtr != null){
            current = frontPtr;
            frontPtr = frontPtr.next;
            current.next = null;
        }
        rearPrt = null;
        length = 0;
    }
    void display(){
        Node current = frontPtr;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedQueue q = new LinkedQueue();
        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(12);
        q.display();
        q.clearQueue();
        q.display();

    }
}
