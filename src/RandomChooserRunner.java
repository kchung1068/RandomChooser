/**
 * Created by bob.brown on 2/27/17.
 */
public class RandomChooserRunner {
    public static void main(String args[])
    {
        System.out.println("Part A:\n");
        String[] wordArray = {"wheels", "on", "the", "bus"};
        RandomStringChooser sChooser = new RandomStringChooser(wordArray);
        for (int k = 0; k < 6; k++)
        {
            System.out.print(sChooser.getNext() + " ");
        }

        System.out.println("\n\nPart B:\n");

        RandomLetterChooser letterChooser = new RandomLetterChooser("cat");
        for (int k = 0; k < 4; k++)
        {
            System.out.print(letterChooser.getNext());
        }




    }
}
