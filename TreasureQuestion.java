import java.util.Scanner;
import java.util.arrays;


public class TreasureQuestion {

    private String clue;
    private String [] options;
    private String correctAnswer;
    private String treasureLocation;
    

    public TreasureQuestion(String clue ,String [] options , String correctAnswer , String treasureLocation ){
        this.clue=clue;
        this.options=options;
        this.correctAnswer=correctAnswer;
        this.treasureLocation=treasureLocation;
    }

    public String getClue(){
        return clue;
    }

    public String[] getOptions() {
        return options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getTreasureLocation() {
        return treasureLocation;
    }
    
    public void setClue(String clue) {
        this.clue = clue;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setTreasureLocation(String treasureLocation) {
        this.treasureLocation = treasureLocation;
    }

    @Override
    public String toString(){
        return "Clue:" + clue+
               "Options:" + Arrays.toString(options) +
               "Correct Answer:" + correctAnswer +
               "Treasure Location:" + treasureLocation;
    }
}
