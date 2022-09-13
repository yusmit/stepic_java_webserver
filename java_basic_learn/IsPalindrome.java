

/**
 * Checks if given <code>text</code> is a palindrome.
 *
 * @param text any string
 * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
 */
public static boolean isPalindrome(String text) {
        String result = text.replaceAll("\\W", "").toLowerCase();
        //System.out.println(result);
        return result.equalsIgnoreCase((new StringBuilder(result)).reverse().toString());
}