import java.util.*;

public class VotingService
{
    //Holds all the id strings
    private ArrayList<String> uniqueID = new ArrayList<String>();

    private int[] counter;
    private final int[] countTF = {0, 0};
    private final int[] countMC = {0, 0, 0, 0, 0, 0};

    //Voting Service differs depending on type of question
    public VotingService(QuestionTF tf) //True and false
    {
        counter = countTF;
    }
    
    public VotingService(QuestionMC mc) //Multiple select/choice
    {
        counter = countMC;
    }

    //Prints out the results of how many students answered each one
    public void SubmissionResults(int[] counter, String[] questionChoice)
    {
        for (int i = 0; i < questionChoice.length; i++)
        {
            System.out.println(questionChoice[i] + " : " + counter[i]);
        }
    }

    //Add counter methods
    public void AddCounter(boolean tfAnswer)    //True and false
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

    public void AddCounter(boolean[] mcAnswer)  //Multiple Choice
    {
        for (int i = 0; i < mcAnswer.length; i++)
        {
            if (mcAnswer[i])
            {
                counter[i]++;
            }
        }
    }
}
