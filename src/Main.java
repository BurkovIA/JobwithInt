import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        ArrayList<Integer> positiveNambers = new ArrayList<Integer>();
        for (int number : intList) {
            if (number > 0) {
                positiveNambers.add(number);
            }
        }

        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for (int number : positiveNambers) {
            if (number %2 == 0) {
                evenNumbers.add(number);
            }
        }

        Collections.sort(evenNumbers);

        System.out.println(evenNumbers);

    }
}