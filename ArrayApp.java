import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayApp {

    private static Integer[] intArray = {1, 2, 3, 4, 5, 6};
    private static String[] strArray = {"one", "two", "three", "four", "five", "six"};
    private static List<Integer> integerList = new ArrayList<>();
    private static List<String> stringList = new ArrayList<>();

    public static void main(String[] args) {
        ArrayServices<Integer> integerArrayServices = new ArrayServices<>();
        ArrayServices<String> stringArrayServices = new ArrayServices<>();

        integerArrayServices.changeItemOfArray(2, 5, intArray);
        System.out.println(Arrays.toString(intArray));
        stringArrayServices.changeItemOfArray(0, 3, strArray);
        System.out.println(Arrays.toString(strArray));

        integerList = integerArrayServices.convertToList(intArray);
        stringList = stringArrayServices.convertToList(strArray);
        System.out.println(integerList);
        System.out.println(stringList);

    }
}
