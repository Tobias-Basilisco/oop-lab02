package it.unibo.arrays;

class MyCircularArray {
    final int SIZE = 10;

    int index;
    int[] array;

    MyCircularArray() {
        this.array = new int[SIZE];
        this.index = 0;
    }

    MyCircularArray(int size) {
        this.array = new int[size];
        this.index = 0;
    }

    void add(final int elem) {
        this.array[this.index] = elem;
        this.index = (this.index + 1) % this.array.length;
    }

    void reset() {
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = 0;
        }
        this.index = 0;
    }

    void printArray() {
        System.out.print("[");
        for (int i = 0; i < this.array.length - 1; i++) {
            System.out.print(this.array[i] + ",");
        }
        System.out.println(this.array[this.array.length - 1] + "]");
    }

    public static void main(final String[] args) {

        // 1) Creare un array circolare di dieci elementi
        MyCircularArray circularArray1 = new MyCircularArray();

        // 2) Aggiungere gli elementi da 1 a 10 e stampare il contenuto
        // dell'array circolare
        for (int i = 0; i < circularArray1.array.length; i++){
            circularArray1.add(i + 1);
        }
        circularArray1.printArray();

        // 3) Aggiungere gli elementi da 11 a 15 e stampare il contenuto
        // dell'array circolare
        for (int i = 11; i <= 15; i++){
            circularArray1.add(i);
        }
        circularArray1.printArray();


        // 4) Invocare il metodo reset
        circularArray1.reset();

        // 5) Stampare il contenuto dell'array circolare
        circularArray1.printArray();
        // 6) Aggiungere altri elementi a piacere e stampare il contenuto
        // dell'array circolare
        for (int i = 11; i <= 15; i++){
            circularArray1.add(i);
        }
        circularArray1.printArray();
    }
}
