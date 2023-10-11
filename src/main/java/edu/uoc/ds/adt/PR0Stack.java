package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;

import java.time.LocalDate;

public class PR0Stack {
    public final int CAPACITY = 10;

    //private Stack<Character> stack;
    private Stack<LocalDate> stack;

    public PR0Stack() {
        newStack();
    }

    public void newStack() {
        stack = new StackArrayImpl<LocalDate>(CAPACITY);
    }


    public String clearAllStack() {
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop()).append(" ");
        return sb.toString();
    }

    public Stack<LocalDate> getStack() {
        return this.stack;
    }

    public void push(LocalDate c) {
        this.stack.push(c);
    }
}
