/**
 * Created by guilmarc on 2016-02-04.
 */
public class Deque<T>{

    private int size;
    private int[] array;
    private int itemCount = 0;

    private int rightIndex;
    private int leftIndex;

    public Deque(int size){
        this.size = size;
        this.array = new int[size];
        leftIndex = 0;
        rightIndex = size - 1;
    }

    public void insertLeft(int item){
        if (this.isFull()) { throw new RuntimeException("Queue is full");}

        if (leftIndex == 0)
            leftIndex = size;
        this.array[--leftIndex] = item;
        itemCount++;
    }

    public void insertRight(int item){
        if (this.isFull()) { throw new RuntimeException("Queue is full");}

        if (rightIndex == (size - 1))
            rightIndex = -1;
        this.array[++rightIndex] = item;
        itemCount++;
    }

    public int removeLeft() {
        if (this.isEmpty()) { throw new RuntimeException("Queue is Empty");}

        int temp = this.array[leftIndex];
        leftIndex++;
        if (leftIndex == (size - 1))
            leftIndex = -1;
        itemCount--;
        return temp;
    }

    public int removeRight(){
        if (this.isEmpty()) { throw new RuntimeException("Queue is Empty");}

        int temp = this.array[rightIndex];
        rightIndex--;
        if (rightIndex < 0)
            rightIndex = size - 1;
        itemCount--;
        return temp;
    }

    public boolean isEmpty(){
        return (this.itemCount == 0);
    }

    public boolean isFull(){
        return this.itemCount == this.size;
    }

}
