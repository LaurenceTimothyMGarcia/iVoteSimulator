import java.util.*;

public class VotingService
{
    //Holds all the id strings
    private ArrayList<Student> studentsList = new ArrayList<Student>();
    private ArrayList<String> uniqueID = new ArrayList<String>();

    private QuestionTF trueFalse;
    private QuestionMC multipleChoice;

    private int[] counter;
    private final int[] countTF = {0, 0};
    private final int[] countMC = {0, 0, 0, 0, 0, 0};

    //Voting Service differs depending on type of question
    public VotingService(ArrayList<Student> stud, QuestionTF tf) //True and false
    {
        studentsList = stud;
        trueFalse = tf;
        counter = countTF;
    }
    
    public VotingService(ArrayList<Student> stud, QuestionMC mc) //Multiple select/choice
    {
        studentsList = stud;
        multipleChoice = mc;
        counter = countMC;
    }

    //Prints out the results of how many students answered each one
    public void submissionResults(int[] counter, String[] questionChoice)
    {
        for (int i = 0; i < questionChoice.length; i++)
        {
            System.out.println(questionChoice[i] + " : " + counter[i]);
        }
    }

    //Add counter methods
    public void addCounter(boolean tfAnswer)    //True and false
    {
        if (tfAnswer)
        {
            counter[0]++;
        }
        else
        {
            counter[1]++;
        }
    }

    public void addCounter(boolean[] mcAnswer)  //Multiple Choice
    {
        for (int i = 0; i < mcAnswer.length; i++)
        {
            if (mcAnswer[i])
            {
                counter[i]++;
            }
        }
    }

    //Accessor Methods
    public int[] getCounter()
    {
        return counter;
    }
}
