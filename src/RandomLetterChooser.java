public class RandomLetterChooser extends RandomStringChooser
{
    /** Constructs a random letter chooser using the given string str.
     * Precondition: str contains only letters.
     */
    public RandomLetterChooser(String str)
    {

        super(getSingleLetters(str));
    }

    /** Returns an array of single-letter strings.
     *  Each of these strings consists of a single letter from str. Element k
     *  of the returned array contains the single letter at position k of str.
     *  For example, getSingleLetters("cat") returns the
     *  array { "c", "a", "t" }.
     */
    public static String[] getSingleLetters(String str)
    {
        String[] letters = new String[str.length()];
        for( int x = 0; x < str.length(); x++)
        {
            letters[x] = str.substring(x,x+1);
        }
        return letters;
    }
}
