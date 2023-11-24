
package com.main;
import com.arrayops.ArrayDemo;

public class Main {
    public static void main(String[] args) {
        ArrayDemo arrayDemo = new ArrayDemo(10);

        // Insert values at specific positions
        arrayDemo.insertValue(0, 10);
        arrayDemo.insertValue(2, 30);
        arrayDemo.insertValue(4, 50);

        // Delete elements at specific positions
        arrayDemo.deleteElement(1);
        arrayDemo.deleteElement(3);

        // Insert more values
        arrayDemo.insertValue(6, 70);
        arrayDemo.insertValue(8, 90);

        // Delete a specific value
        arrayDemo.deleteValue(70);

        // Display the array
        arrayDemo.traverseArray();
    }
}