package Reverse_Stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyStack<E> {

    private LinkedList<E> stack;
    private int size = 0;

    public MyStack() {
        stack = new LinkedList<>();
    }

    public boolean isEmpty(){
        if (stack.size()==0){
            return true;
        }
        return false;
    }

    public void push(E o){
        stack.addFirst(o);
        size++;
    }

    public E pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        size--;
        return (E)stack.removeFirst();

    }

    public int size(){
        return stack.size();
    }

    public E reverse(){
        MyStack<E> myStack = new MyStack<>();
        for (int i = 0; i < size; i++) {
            myStack.push(stack.pop());
        }return (E) myStack;
    }

    @Override
    public String toString() {
        StringBuilder stringBuffer = new StringBuilder("Stack= [");
        for (int i = 0; i < size ; i++) {
            stringBuffer.append(stack.pop());
            if (i < size - 1) {
                stringBuffer.append(", ");
            }
        }
        return stringBuffer + "]";
    }
}
