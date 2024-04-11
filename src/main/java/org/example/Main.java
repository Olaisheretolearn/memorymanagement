import java.util.Stack;

public class MemoryStackDemo {
    public static void main(String[] args) {
        System.out.println("If you can see this , source code already COMPILED to bytescode......\n");
        System.out.println("JVM started....\n");
        System.out.println("heap for objects created....\n");



        System.out.println("Method area for classes , interfaces , project structures created.......\n");




        System.out.println("Stack created for object references , dynamic linking and returning values for methods......\n");
        // Create a stack to simulate memory allocation
        Stack<Object> memoryStack = new Stack<>();

        // Create objects to allocate memory
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();

        // Allocate memory by pushing objects onto the stack
        memoryStack.push(obj1);
        memoryStack.push(obj2);
        memoryStack.push(obj3);

        System.out.println("Memory allocated for objects: " + memoryStack);

        // Deallocate memory by popping objects from the stack
        Object poppedObj;
        while ((poppedObj = memoryStack.pop()) != null) {
            System.out.println("Deallocated memory for object: " + poppedObj);
        }

        System.out.println("Memory deallocated for all objects. Current stack: " + memoryStack);


        System.out.println("JVM is about to exit , and so everything within it....\n");
    }
}