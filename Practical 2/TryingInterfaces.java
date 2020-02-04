// Trying interfaces
interface FirstInterface {
    public void myMethod();
}

interface SecondInterface {
    public void myOtherMethod();
}

class TryingInterfaces implements FirstInterface, SecondInterface {

    public void myMethod() {
        System.out.println("Some text..");
    }

    public void myOtherMethod() {
        System.out.println("Some other text..");
    }
} 