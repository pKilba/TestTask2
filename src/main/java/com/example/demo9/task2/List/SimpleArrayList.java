package com.example.demo9.task2.List;

public class SimpleArrayList<E> implements SimpleList<E> {

    private E[] values;

    public SimpleArrayList() {
        this.values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {

        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException exception) {
            return false;
        }

    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }
}
