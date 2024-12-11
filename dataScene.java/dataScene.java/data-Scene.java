dataScene.javaimport org.code.theater.*;
import org.code.media.*;

/**
 * Represents a Scene to be played in the Theater using data from
 * a choses dataset
 */
public class DataScene extends Scene {

  private Olympian[] olympians;      // 1D array of Person objects

  /** Constructor */
  public DataScene() {
    olympians = createOlympians();
  }

  /** Returns a 1D array of Person objects using the txt files in this project */
  public Olympian[] createOlympians() {
    String[] nameArray = FileReader.toStringArray("name.txt");
    String[] birthdayArray = FileReader.toStringArray("birthday.txt");
    String[] sportArray = FileReader.toStringArray("sport.txt");
    String[] medalArray  = FileReader.toStringArray("medal.txt");


    Olympian[] olympiansArray = new Olympian[nameArray.length];
    for (int i = 0; i < olympiansArray.length; i++) {
      olympiansArray[i] = new Olympian(nameArray[i], birthdayArray[i], sportArray[i], medalArray[i]);
    }

    return olympiansArray;
  }

  /**
   * Top-level method to draw the animation
   */
 public void drawScene() {
    //displays a randomized olympian and the corresponding info from the data sets
    int randomIndex = (int) (Math.random() *olympians.length);
    Olympian olmp = olympians[randomIndex];
   
   //if-else-if statement using an or operator in if-statement that displays an image based on the medal
    if (olmp.getMedal().equals("Gold") || olmp.getMedal().equals("Silver")) {
    clear("white");
    drawImage("rings.jpeg", 50, 50, 300);
} else if (olmp.getMedal().equals("Bronze")) {
    clear("white");
    drawImage("medals.jpeg", 50, 50, 300);
}
    playSound("442582__wangzhuokun__181001_001_crowd_cheer.wav");
    pause(0.5);
   
    //displays text for all the data sets 
    drawText(olmp.toStringName(), 15, 100);
    drawText(olmp.toStringBirthday(), 15, 150);
    drawText(olmp.toStringMedal(), 15, 200);
    drawText(olmp.toStringSport(), 15, 250);
    System.out.println(olmp);
  }

}