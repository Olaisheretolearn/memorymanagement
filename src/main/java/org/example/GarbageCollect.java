package org.example;

public class GarbageCollect {
    public static void main(String[] args) {
        // Create an object and print it
        MyObject myObject = new MyObject();
        System.out.println("Before GC: " + myObject);

        // Remove references to the object
        myObject = null;

        // Request garbage collection (but it's not guaranteed)
        System.gc();

        // Print the object again (assuming it has been garbage collected)
        System.out.println("After GC: " + myObject);

        //it is still unpredictable anyways so, its as good as dead
    }
}

class MyObject {
    @Override
    public String toString() {
        return "MyObject [hashCode=" + hashCode() + "]";
    }
}
