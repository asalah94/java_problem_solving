package learning.DataStrctureImpl;

public class Queue {

    int rear;
    int front;
    int length;
    int MAX_LENGHT = 5;
    int arr []  = new int[MAX_LENGHT];
    public Queue() {
        front = 0;
        rear = MAX_LENGHT - 1;
        length = 0;
    }

    Boolean isEmpty(){
        if (length ==0 ){
            return true;
        }
        else {
            return false;
        }

    }

    Boolean isFull(){
        return length == MAX_LENGHT;
    }

    void enqueue (int Element ){

        if (isFull()){
            System.out.println("queue is full ");
        }
        else{
            rear = (rear+1) % MAX_LENGHT;
            arr[rear] = Element;
            length++;
        }


    }

    void dequeue(){
        if (isEmpty()){
            System.out.println("queue is empty");
        }
        else {
            front = (front+1) % MAX_LENGHT;
            length --;
        }
    }
    int getFront(){
        assert  ! isEmpty();
        return  arr[front];

    }
    int getRear(){
        assert  ! isEmpty();
        return  arr[rear];

    }

    void printQueue(){
        if (isEmpty() ){
            System.out.println("empty");
        }
        else{
        for (int i = front  ; i != rear +1 ; i =  (i+1)% MAX_LENGHT ){
            System.out.println(arr[i]);
        }}
    }

    public static void main(String[] args) {
        Queue q=  new Queue();
//        q.enqueue(30);
//        q.enqueue(3);
//        q.enqueue(21);
        System.out.println(q.getFront());
       // q.dequeue();
        q.printQueue();

    }
}
