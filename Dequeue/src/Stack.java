/**
 * Created by guilmarc on 2016-02-04.
 */
public class Stack {

    private int[] array;
    private Deque deque;

    public Stack(int size){
        deque = new Deque(size);
    }

    public int pop() {
        return deque.removeLeft();
    }

    public void push(int item){
        deque.insertLeft(item);
    }

    public boolean isFull(){
        return deque.isFull();
    }

    public boolean isEmpty(){
        return deque.isEmpty();
    }

}
