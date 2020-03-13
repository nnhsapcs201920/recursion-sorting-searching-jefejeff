
/**
 * Write a description of class StringReverse here.
 *
 * @author jcheng3
 * @version 13 March 2020
 */
public class StringReverse
{
    public static String reverse(String str)
    {
        //must have a terminating case
        if(str.equals(""))
        {
            return str;
        }

        //must make the problem simple
        String firstChar = str.substring(0, 1);
        String restOfString = str.substring(1);

        //recurse - call this method with a simpler problem
        String restOfStringReversed = reverse(restOfString);

        //build and return the solution
        String strReversed = restOfStringReversed + firstChar;
        return strReversed;
    }

    public static String reverseIter(String str)
    {
        String strReversed = "";
        for(int i = 0; i < str.length(); i++)
        {
            strReversed = str.substring(i, i+1) + strReversed;
        }
        return strReversed;
    }
}
