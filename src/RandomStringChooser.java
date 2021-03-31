public class RandomStringChooser {
   private String strings[] = {""};


    public RandomStringChooser() {
     this.strings = new String[0];
     this.strings[0] = "Word";
    }

    public RandomStringChooser(String[] strings) {

      this.strings = strings;
    }
    public String getNext() {
     String[] list = strings;
     String toReturn = "";
     int randomNumber = (int)(Math.random() * list.length);

         if ( !(list[randomNumber].equals("NONE"))) {

          toReturn = strings[randomNumber];
          strings[randomNumber] = "NONE";
          return toReturn;

     }
      return "NONE";
    }

}