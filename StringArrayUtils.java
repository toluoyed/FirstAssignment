
/**
 * Created by Yang on 1/23/20.
 */
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List; 
import java.util.stream.Collectors; 
import java.util.stream.IntStream;
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        int size = array.length;
        if (size > 1){
            return array[0];
        }
        return null;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        int size = array.length;
        if (size > 2){
        return array[1];
    }
        return null;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int size = array.length;
        return array[size-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int size = array.length;
        return array[size-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i < array.length-1; i++){
            if (array[i].equals(value)){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int size = array.length;
        String[] revarray = new String[size];
        int j = 0;
        for (int i = size-1; i >= 0; i--){
            revarray[j]  = array[i];
            j++;
        }
        
        return revarray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int i = 0;
        int j = array.length -1;
        if (i == j){
            return true;
        }
        while (i < j){
            if(array[i].equals(array[j]) != true){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(value)){
                count = count + 1;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int size = array.length;
        String anotherArray[] = new String[size];
        for(int i = 0; i < array.length; i++){
            if (array[i].equals(valueToRemove)){
                anotherArray = new String[array.length - 1]; 
  
                System.arraycopy(array, 0, anotherArray, 0, i); 
           
                System.arraycopy(array, i + 1, 
                                 anotherArray, i, 
                                 array.length - i - 1); 
          
            }
        }
        return anotherArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int size = array.length;
        //String anotherArray[] = new String[size];
        for(int i = array.length-1; i > 0; i--){
            if (array[i].equals(array[i-1])){
                 for (int j = 0; j < size; j++){
                     if(array[j].equals(array[i-1])){
                         for (int z = j; z < size -1; z++){
                             array[z] = array[z+1]; 
                         }
                     }
                 }
            }
        }
        return array;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add(array[0]);
        for(int i = 1, j = 0; i < array.length; i++){
            if(array[i].equals(Character.toString(arr.get(j).charAt(0)))){
                String concat = arr.get(j)+array[i];
                arr.set(j,concat);
            }
            else{
                arr.add(array[i]);
                j++;
            }
        }
        return arr.toArray(new String[arr.size()]);
    }


}
