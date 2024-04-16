package ua.goit.polymorpism.Module9.HomeWork9;


import java.util.Arrays;



public class MyQueue<T> {

    private T arr[];
    private int head = 0;

    public MyQueue() {
        this.arr = (T[]) new Object[0];
    }

    public void add(T value) {
      int len = this.arr.length;
      this.arr = Arrays.copyOf(this.arr, len+1);
      this.arr[len] = value;
    }

    public void clear() {
        this.arr =(T[]) new Object[0];
    }

    public T peek(){
        if (this.arr.length==0) {
            throw new NullPointerException();
        }
        return this.arr[this.head];
    }

    public T poll() {
        if (this.arr.length==0) {
            throw  new NullPointerException();
        }
        T element = this.arr[this.head];
       this.arr = Arrays.copyOfRange(this.arr, 1, this.arr.length);
        return element;
    }

    public int size() {
        return this.arr.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(this.arr, this.arr.length));
    }
}
