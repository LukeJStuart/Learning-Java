public class FirstTry {
    public static void main(String[] args) {
        // This is a single-line comment
        /* This is a multi-line
        comment */
        System.out.println("Hello World");
        String name = "John";
        System.out.println(name);
        int myNum = 15;
        System.out.println(myNum);
        myNum += 10;
        System.out.println(myNum);
        float myFloat = 5.99f;
        System.out.println(myFloat);
        System.out.println("Hello " + name);
        int x = 5, y = 10, z = 50;
        System.out.println(x + y + z);
        byte myByte = -125;
        System.out.println(myByte);
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);
        char myChar = 66;
        System.out.println(myChar);
        // Trying narrowing casting
        double myDouble = 9.87;
        int myInt = (int) myDouble;
        System.out.println(myInt);
        // Trying logic operators
        System.out.println(true && false);
        System.out.println(! false);
        System.out.println(false || false);
        // Trying string length
        name = "Johannes";
        System.out.println("The length of 'Johannes' is: " + name.length());
        // Trying capitalisation and the opposite
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        // Trying finding position of something in a string
        // Note that -1 is returned when the search term is not in the string
        System.out.println(name.indexOf("ann"));
        System.out.println(name.indexOf("bann"));
        // Trying concat function and escape character
        System.out.println(name.concat("\"Hello\""));
        // Trying adding a string and a number
        // Note that the result is a string
        System.out.println("Hello" + 10);
        // Trying some Java Math functions
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        System.out.println((int) Math.sqrt(25));
        System.out.println(Math.abs(-9.01));
        System.out.println(Math.random());
        // Trying an if statement
        if (10 > f1) {
            System.out.println("IF STATEMENT");
        } else if (10 > d1) {
            System.out.println("ELSE IF");
        } else {
            System.out.println("ELSE");
        }
        // Trying out the ternary operator
        String output = "";
        output = (name.length() > 5) ? "Woo" : "Hoo";
        System.out.println(output);
        // Trying a switch statement
        String benDescriptor = "Big";
        switch(benDescriptor) {
            case "Big":
            System.out.println("It's Big Ben!");
            break;
            case "Little":
            System.out.println("It's Little Ben!");
            break;
            default:
            System.out.println("It is not a Ben...");
        }
        // Trying a while loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        // Trying a do while loop
        i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
        // Trying a for loop
        for (float j = 1; j < 10; j *= 1.5) {
            System.out.println(j);
        }
        // Trying a for-each loop and a continue
        String[] people = {"Big Ben", "Little Ben", "Rory"};
        for (String k : people) {
            if (k == "Little Ben") {
                continue;
            }
            System.out.println(k);
        }
        // Trying out arrays
        int nums[] = {10, 5, 12, 30};
        for (int j = 0; j < nums.length; j++) {
            System.out.println(nums[j]);
        }
        int matrix[][] = {{0, 1, 2, 3}, {2, 4, 1, 4}};
        System.out.println(matrix[0][1]);
        // Trying new method
        System.out.println(myMethod(1, 19));
        System.out.println(3 + 1.5);
        // Trying objects
        FirstTry obj1 = new FirstTry();
        FirstTry obj2 = new FirstTry();
        System.out.println(obj1);
        System.out.println(obj2);
    }
    // Making a new method
    static int myMethod(int x, int y) {
        return x + y;
    }
    // Demonstrating method overloading
    static float myMethod(float x, float y) {
        return x + y;   
    }
}