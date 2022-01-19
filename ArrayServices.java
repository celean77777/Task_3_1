import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class ArrayServices <E extends Object> {

    public void changeItemOfArray (int firstElement, int secondElement, E[] inputArray) {
        E buffer;
        buffer = inputArray[firstElement];
        inputArray[firstElement] = inputArray[secondElement];
        inputArray[secondElement] = buffer;
        return;
    }
    public List<E> convertToList (E[] array){
        return Arrays.asList(array);
    }

}
