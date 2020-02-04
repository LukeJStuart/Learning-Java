// Class to test out the use of inner classes in Zoo.java
class ZooTest {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Longleet");
        Zoo.Enclosure myEnclosure = myZoo.new Enclosure("Monkey Exhibit");
        myEnclosure.welcomeMessage();
    }
}