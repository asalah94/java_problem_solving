package learning.DataStrctureImpl;

public class arrayListImp {
    int array[];
    int maxSize;
    int length;

    public arrayListImp(int s) {

        if(s<0){
            maxSize = 10;

        }
        else {
            maxSize = s;
            length =0;
            array = new int[maxSize];
        }
    }

    boolean isEmpty(){
        return  length ==0;
        }
    boolean isFull(){
        return  length ==maxSize;
    }
    int getSize(){
        return length;
    }

    void print(){
   for(int i = 0 ; i < length ; i++ ){
       System.out.println(array[i]);
    }}
    void  insert(int pos , int Element){
        if(isFull()){
            System.out.println("array is full");
        }
        else if(pos<0 || pos > length){
            System.out.println("out of range");
        }
        else{
            for(int  i = length ; i > pos ; i--){
              array[i] = array[i-1];
            }
            array[pos] = Element;
            length++;
        }
    }
    void removeAt(int pos){
        if (isEmpty()){
            System.out.println("array is empty");
        }
        else if(pos<0 || pos > length){
            System.out.println("out of range");
        }
        else{
            for (int  i = pos ; i < length ; i++){
                array[i] = array[i+1];
                length --;
            }
        }
    }
     int  search(int Element){
        for(int i =0 ; i< length ; i++){
            if(array[i] == Element){
                System.out.println(i);
                return i;

            }

        }
        return  -1;
    }

    public static void main(String[] args) {
        arrayListImp arr = new arrayListImp(56);
        arr.insert(0, 1);
        arr.insert(1, 2);
       // arr.print();
        arr.insert(1,7);
       // arr.removeAt(1);
       // arr.print();
        arr.search(2);
    }
}
