import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Demonstrates the use of nested while loops.
 * 
 * @author Lewis/Loftus/Cocking
 */
public class PalindromeTester
{
    /**
     * Tests strings to see if they are palindromes.
     *
     */
    public static void main (String[] args) throws FileNotFoundException
    {
        String str = "";
        int left, right;
        String fileName = "palindrome.txt";

        File inputFile = new File(fileName);
        Scanner s = new Scanner(inputFile);
        //make everything that isn't a letter a delimiter
        s.useDelimiter("(^A-Za-z)+");

        // read the entire file, one word at a time, and concatenate each word into str
        while(s.hasNext())
        {
            str += s.next();
        }
        s.close();

        //make the entire string lowercase
        str = str.toLowerCase();

        System.out.println(str);

        if(isPalindrome(str))
        {
            System.out.println ("That string IS a palindrome.");
        }
        else
        {
        }
        System.out.println ("That string is NOT a palindrome.");
    }

    public static boolean isPalindrome(String str)
    {
        //must have a terminating case
        if(str.length() <= 1)
        {
            return true;
        }

        //solve a small part of the problem
        String firstChar = str.substring(0, 1);
        String lastChar = str.substring(str.length() - 1);
        if(firstChar.equals(lastChar))
        {
            //recurse with a simpler version of the problem
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        else
        {
            return false;
        }

    }
}
