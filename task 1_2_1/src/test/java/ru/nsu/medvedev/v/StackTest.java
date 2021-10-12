package ru.nsu.medvedev.v;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTest {
    MyStack<Integer> stack;

    @BeforeEach
    private void newStack() {
        stack = new MyStack<>();
    }

    @Test
    public void some_test() {
        stack.push(15);
        stack.push(1);
        stack.push(3);
        int size = stack.count();
        int var1 = stack.pop();
        int var2 = stack.pop();
        int var3 = stack.pop();
        Assertions.assertEquals(3, size);
        Assertions.assertEquals(var1, 3);
        Assertions.assertEquals(var2, 1);
        Assertions.assertEquals(var3, 15);
        Assertions.assertEquals(0, stack.count());
    }

    @Test
    public void stack_push() {
        stack.push(1);
        MyStack<Integer> newstack = new MyStack<>();
        newstack.push(3);
        newstack.push(12);
        newstack.push(7);
        stack.pushStack(newstack);
        int var1 = stack.pop();
        int var2 = stack.pop();
        Assertions.assertEquals(var1, 7);
        Assertions.assertEquals(var2, 12);
    }

    @Test
    public void pushStack_popStack_NotEmptyStack() {
        MyStack<Integer> stack2 = new MyStack<>();
        stack.push(12);
        stack.push(11);
        stack2.push(10);
        stack2.push(9);
        stack.push(1);
        stack.pushStack(stack2);
        Assertions.assertEquals(5, stack.count());
        stack.popStack(4);
        Assertions.assertEquals(12, stack.pop());
        Assertions.assertEquals(0, stack.count());
    }

}
