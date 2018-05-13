

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * ArrayStringSortConsonantsRunner.
 *
 * @author Mikhail Klimentyev
 * @version 1.0
 * @since 5/12/2018
 */

public class ArrayStringSortConsonantsRunner {
    public static void main(String[] args) {

        ArrayStringSortConsonantsRunner runner = new ArrayStringSortConsonantsRunner();
        String[] stringArray = new String[]{"rgfgr", "fgaavbaa", "edb", "rgffgfgfgf", "e", "d", "ed", "rgafgfgagfa", "dede", "ded"};

        System.out.println(Arrays.toString(stringArray));

        //=========================================== Bubble sorting ==================================================
        String temp;
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < stringArray.length - 1; i++) {
                if (runner.compareStringsByCountOfConsonants(stringArray[i], stringArray[i + 1])) {
                    isSorted = false;
                    temp = stringArray[i + 1];
                    stringArray[i + 1] = stringArray[i];
                    stringArray[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(stringArray));
    }

    /**
     * compareStringsByCountOfConsonants
     * @param firstString [i]-th element of String array
     * @param secondString [i + 1]-th element of String array
     * @return - true if first String contains more consonants than second String otherwise returns false.
     */
    public boolean compareStringsByCountOfConsonants(String firstString, String secondString) {

        Pattern pattern = Pattern.compile("[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]");
        Matcher firstMatcher = pattern.matcher(firstString);

        boolean firstFound = firstMatcher.matches();
        int firstCount = 0;
        while (firstMatcher.find()) {
            firstCount++;
        }


        Matcher secondMatcher = pattern.matcher(secondString);

        boolean secondFound = secondMatcher.matches();
        int secondCount = 0;
        while (secondMatcher.find()) {
            secondCount++;
        }

        if (firstCount > secondCount) {
            return true;
        } else {
            return false;
        }
    }
}

