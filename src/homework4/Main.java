package homework4;
import java.util.Arrays;
public class Main {
    public static String globalVar = "Global";
    private String localVar = "Hillel";
    public void printVariables() {
        System.out.println("Global variable: " + globalVar);
        System.out.println("Local variable: " + localVar);
    }
    public void Arrays() {
        int[] myArray = {1, 2, 3, 4, 5};
        char myChar = 'B';
        System.out.println("Array: " + Arrays.toString(myArray));
        System.out.println("Symbol: " + myChar);
        myArray[2] = 16;
        System.out.println("Edited Array: " + Arrays.toString(myArray));
        myChar = 'M';
        System.out.println("Edited Symbol: " + myChar);
    }
    public static void main(String[] args) {
        Main object = new Main();
        object.printVariables();
        object.Arrays();
    }
}