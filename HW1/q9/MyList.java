package HW1.q9;

import java.util.Arrays;

class MyList {
    private int capacity;
    private String[] arr;

    public MyList() {
        this.capacity = 5;
        this.arr = new String[this.capacity];
    }

    public int size() {
        int size = 0;

        for (String s : this.arr) {
            if (s != null) size++;
        }

        return size;
    }

    public void add(String data) {
        checkCapacity:

        if (data.toLowerCase().startsWith("c")) {
            if (size() == getCapacity()) {
                this.arr = Arrays.copyOf(this.arr, getCapacity() + 7);
                setCapacity(this.arr.length);
            }

            for (int i = 0; i < this.arr.length; i++) {
                if (this.arr[i] == null) {
                    this.arr[i] = data;
                    break checkCapacity;
                }
            }
        }
    }

    public void print() {
        for (String s : this.arr) {
            if (s != null) {
                System.out.println("- " + s);
            }
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }
}
