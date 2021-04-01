import java.util.ArrayList;

public class RandomStringChooser {
   private String strings[];
   private ArrayList<String> stringList = new ArrayList<String>();

    public RandomStringChooser() {
     this.strings = new String[0];
     this.strings[0] = "Word";

    }

    public RandomStringChooser(String[] strings) {

      this.strings = strings;
      for (int x = 0; x < strings.length; x += 1) {
       stringList.add(strings[x]);
      }

    }
    public String getNext() {

   if (stringList.size() == 0) {
    return "NONE";

   } else {
    int randomNumber = (int)(Math.random() * stringList.size());
    String toReturn = stringList.get(randomNumber);

    stringList.remove(randomNumber);
    return toReturn;
   }


     }


    }

