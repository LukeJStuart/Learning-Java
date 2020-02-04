public class MyClass {
    // N.B. that you can declare an attribute as final if
    // you don't want to be able to override its initial
    // value.
    private int x = 5;

    // Static methods can be accessed without creating an
    // object of the class, unlike public methods, which
    // can only be accessed by objects.

    // Get method
    public int getX() {
        return x;
    }

    // Set method
    public void setX(int newX) {
        this.x = newX;
    }
    
    // Static method
    static void myStaticMethod() {
        System.out.println("Static Method");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public Method");
    }

    // Constructor
    // The constructor name must match the class name,
    // and it cannot have a return type (like void).
    // The constructor is called when the object is
    // created.
    // Constructors can also take parameters, which is
    // also used to initialise attributes.
    public MyClass(int y) {
        // Setting the initial value for the class
        // attribute x.
        this.x = y;
    }

    // Main method
    public static void main(String[] args) {
        myStaticMethod();
        MyClass myObject = new MyClass(5);
        myObject.myPublicMethod();
    }
}