package learning.old;

import java.lang.reflect.Method;

class MyClass {
    public void method1() {
        System.out.println("Method 1 called");
    }

    private void method2() {
        System.out.println("Method 2 called");
    }

    public int add(int a, int b) {
        return a + b;
    }
}

public class ReflectionMethodExample {
    public static void main(String[] args) {
        Class<?> clazz = MyClass.class;

        // Get all public methods of the class
        System.out.println("Public Methods:");
        for (Method method : clazz.getMethods()) {
            System.out.println(method.getName());
        }

        // Get all declared methods of the class (including private ones)
        System.out.println("\nAll Declared Methods:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method.getName());
        }
    }
}
