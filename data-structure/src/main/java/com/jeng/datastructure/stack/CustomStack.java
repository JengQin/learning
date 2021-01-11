package com.jeng.datastructure.stack;

import java.util.Arrays;
import java.util.Stack;

public class CustomStack<E> {

    private Object[] elementData;

    private int size;

    public CustomStack(){
        this(8);
    }
    public CustomStack(int initialCapacity) {
        this.elementData = new Object[initialCapacity];
    }


    // 入栈
    public E push(E v){
        if (size >= elementData.length) {
            grow();
        }
        elementData[size++] = v;
        return v;
    }

    // 出栈
    public E pop() {
        E top = peek();
        elementData[--size] = null;
        return top;
    }

    // 获取栈顶元素
    public E peek() {
        if (size > 0) {
            return (E) elementData[size - 1];
        } else {
            throw new RuntimeException("当前栈为空");
        }
    }

    // 查找元素的下标
    public int search(E v) {
        if (size > 0) {
            if (null == v) {
                for (int i = size - 1; i >= 0; i--) {
                    if (null == elementData[i]) {
                        return size - i;
                    }
                }
            } else {
                for (int i = size - 1; i >= 0; i--) {
                    if (v.equals(elementData[i])) {
                        return size - i;
                    }
                }
            }
        }
        return -1;
    }

    // 是否为空
    public boolean empty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private synchronized void grow(){
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }
    public static void main(String[] args) {
        int initSize = 1;
        Stack<String> stack = new Stack<>();
        CustomStack<String> customStack = new CustomStack<>(initSize);

        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");


        customStack.push("1");
        customStack.push("2");
        customStack.push("3");
        customStack.push("4");

        System.out.println("stack size="+ stack.size());
        System.out.println("customStack size="+ customStack.size());


        System.out.println("stack.peek()="+stack.peek());
        System.out.println("customStack.peek()="+customStack.peek());


        System.out.println("stack.pop()="+stack.pop());
        System.out.println("customStack.pop()="+customStack.pop());


        System.out.println("stack.search(1)="+stack.search("1"));
        System.out.println("customStack.search(1)="+customStack.search("1"));

        System.out.println("stack size="+ stack.size());
        System.out.println("customStack size="+ customStack.size());
    }
}
