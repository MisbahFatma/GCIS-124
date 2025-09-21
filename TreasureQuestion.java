import java.util.Scanner;
import java.util.Arrays;


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
        String result="Clue:" + clue + "\nOptions:\n";
        for (int i=0; i< options.length; i++){
            result +=(i+1) + ". " + options[i] + "\n";
        }
        return result;
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof TreasureQuestion){
            TreasureQuestion other = (TreasureQuestion) (obj);
            return clue.equals(other.clue) && 
            Arrays.equals(options, other.options);
        } else {
          return false;
        }
    }
    public boolean checkAnswer(String answer){
        if(correctAnswer.equals(answer)) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

      String clue = "I am a number, but when you add 'G' to me, I go away....What number am I? \n";
      String[] options = {"Two", "One", "Zero"} ;
      String correctAnswer = "One";
      String treasureLocation = "PAST TIME";
    

      TreasureQuestion question = new TreasureQuestion(clue, options, correctAnswer, treasureLocation);

      System.out.println(question);

      System.out.print("Enter your answer: ");
      String userAnswer = scanner.nextLine();

      if(question.checkAnswer(userAnswer)){
         System.out.println("Correct!! :))) The treasure is located at:" + question.getTreasureLocation());
       }
        else{
            System.out.println("Wrong answer! You have an IQ of -256 :)");
        }
  
       scanner.close();
    
     }
 }
