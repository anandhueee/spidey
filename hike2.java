// HelloWorld.java
public class HelloWorld {
    
    // Main method - entry point of the program
    public static void main(String[] args) {
        // Create an instance of the HelloWorld class
        HelloWorld hw = new HelloWorld();
        
        // Call the method to print a greeting
        hw.printGreeting();
        
        // Call the method to print a personalized greeting
        String userName = "Alice";
        hw.printPersonalizedGreeting(userName);
    }
    
    // Method to print a simple greeting
    public void printGreeting() {
        System.out.println("Hello, World!");
    }
    
    // Method to print a personalized greeting
    public void printPersonalizedGreeting(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
