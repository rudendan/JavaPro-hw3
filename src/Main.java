import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.next();
        String seconfString = scanner.next();

        System.out.println("Input: s = \"" + firstString + "\", t = \"" + seconfString + "\"");
        System.out.println("Output: " + Anagram.checkAnagram(firstString,seconfString));
    }
}
