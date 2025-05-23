public class SampleCode {
    public static void main(String[] args) {
        String hardcodedPassword = "password123"; // Security flaw: hardcoded password
        int unusedVariable; // Code smell: unused variable

        System.out.println("Welcome to SonarQube testing")

        greetUser(null);
    }

    public static void greetUser(String name) {
        if (name.equals("")) {  // Bug: potential NullPointerException if name is null
            System.out.println("Hello, guest!");
        } else {
            System.out.println("Hello, " + name);
        }
    }
}
