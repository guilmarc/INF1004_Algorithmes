/**
* Class : StackX.java
* Author : Marco Choiniere-Guilmette
* Date : 2016-03-12
*
* Description : This is a generic stack able to stack any type of object / primitive
*/

class StackX<T>
{
    private int maxSize;
    private T[] stackArray;
    private int top;
    //--------------------------------------------------------------
    public StackX(int s) // constructor
    {
        maxSize = s;
        stackArray = (T[]) new Object[maxSize];
        top = -1;
    }
    //--------------------------------------------------------------
    public void push(T j) // put item on top of stack
    { stackArray[++top] = j; }
    //--------------------------------------------------------------
    public T pop() // take item from top of stack
    { return stackArray[top--]; }
    //--------------------------------------------------------------
    public T peek() // peek at top of stack
    { return stackArray[top]; }
    //--------------------------------------------------------------
    public boolean isEmpty() // true if stack is empty
    { return (top == -1); }
    //-------------------------------------------------------------
    public int size() // return size
    { return top+1; }
    //--------------------------------------------------------------
    public T peekN(int n) // return item at index n
    { return stackArray[n]; }
    //--------------------------------------------------------------
    public void displayStack(String s)
    {
        System.out.print(s);
        System.out.print("Stack (bottom-->top): ");
        for(int j=0; j<size(); j++)
        {
            System.out.print( peekN(j) );
            System.out.print(' ');
        }
        System.out.println("");
    }
//--------------------------------------------------------------
} // end class StackX
