// This is a simple JAVA program that gets the First, Middle, and the Last value of an array.
// Currently this program uses an array called VALUES you can edit this array and get any value output.

public class Main {
    public static void main(String[] args) {
        String[] Values = {"Tesla", "Porsche", "Ferrari", "Lamborghini", "Chevrolet"};
        int fun = Math.round(Values.length/2);
        System.out.println("This is the number of cars: "+Values.length);
        System.out.println("This is the First car: "+Values[Values.length - Values.length]);
        System.out.println("This is the middle car: "+Values[fun]);
        System.out.println("This is the last car: "+Values[Values.length - 1]);
    }
}