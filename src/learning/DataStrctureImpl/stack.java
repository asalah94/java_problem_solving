package learning.DataStrctureImpl;

public class stack {

    int top;
    int maxSize = 100;
    int item []  = new int[maxSize];

    public stack() {
        top = -1;

    }

    void push(int Element){

        if (top >= maxSize -1) {
            System.out.println("stack full on push");
        }

        else{
        top++;
        item [top] = Element;
        }
    }


    void pop(){
        if(top<0){
            System.out.println("stack is empty");
        }
        else {
            top--;
        }
    }

    public void getTop(){
        if(top<0){
            System.out.println("stack is empty");
        }
        else {
            int stackTop  = item[top];
            System.out.println(stackTop);
        }

    }

    void print(){
        for (int i = top ; i >= 0 ; i--){
            System.out.println(item[i]);
        }
    }

    public static void main(String[] args) {

        stack s  = new stack();
        s.push(5);
        s.push(6);
        s.push(8);
//        s.print();
      //  s.getTop();
        s.pop();

        s.print();

    }
}
