import java.util.Arrays;

public class Anagram {
    public static Boolean checkAnagram (String fString, String sString) {

        char[] fChar = fString.toLowerCase().toCharArray();
        char[] sChar = sString.toLowerCase().toCharArray();

        Arrays.sort(fChar);
        Arrays.sort(sChar);

        String fSortedString = new String(fChar);
        String sSortedString = new String(sChar);

        return fSortedString.equals(sSortedString);

    }
}
