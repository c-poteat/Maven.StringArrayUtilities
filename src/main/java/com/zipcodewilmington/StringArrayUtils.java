package com.zipcodewilmington;

import javafx.util.converter.DoubleStringConverter;
import sun.security.util.ArrayUtil;

import javax.xml.bind.SchemaOutputResolver;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        // Use else statement to check if array contains value.
        String convertedString = Arrays.toString(array);
        if (convertedString == value) {
        }
        return true;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        // Created array
        String[] newStringArray = new String[array.length];
        // Create for loop to iterate through array
        for (int i = 0; i < array.length; i++) {
            // Check to see if contents are indentical in reverse order
            newStringArray[array.length - 1 - i] = array[i];

        }
        return newStringArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        // Create new array reversed
        String[] reverseArray = reverse(array);
        // Create for loop
        for (int i = 0; i < array.length; i++) {
            if (array[i] != reverseArray[i]) {
                return false;
            }
        }
        return true;
    }


    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        // Loop through each value of array
        String convertedArray = Arrays.toString(array).toLowerCase();
        String[] alphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        if (convertedArray.length() < 26) {
            return false;
        }
        for (int i = 0; i < alphabet.length; i++) {
            if (!convertedArray.contains(alphabet[i])) {
                return false;
            }
        }
        return true;
    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
            if(list.contains(valueToRemove)) {
                list.remove(valueToRemove);
            }
                String[] newArray = new String[list.size()];
                list.toArray(newArray);
                System.out.println();
                return newArray;
            }



    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
       // String[] array = {"aba", ("aba",) "baa", "bab", ("bba"), "zzz", "bba", ("bba",) "bba", "bbb", ("bbb"};
    // String[] expected = {"aba", "baa", "bab", "bba", "zzz", "bba", "bbb"};
        ArrayList<String> list = new ArrayList<String>();
        // We have an array of chars (array)
        // Need to identify the consecutive duplicates
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == array[i] + 1) {
                System.out.println(array[i]);
         //   for (int j = i + 1; j < array.length; j++) {
          //      if(array[i].equals(array[j]))
            }
        }

        // Need to remove the duplicates


        // Return the new array without duplicates

        return array;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        String consecutiveDuplicates = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(array[i - 1])) {
                consecutiveDuplicates += array[i];
            } else {
                consecutiveDuplicates = consecutiveDuplicates + " " + array[i];
            }
          }
            return consecutiveDuplicates.split(" ");
        }
    }

