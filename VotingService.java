import java.util.*;

public class VotingService
{
    //Holds all the id strings
    private ArrayList<String> uniqueID = new ArrayList<String>();

    //Prints out the results of how many students answered each one
    public void SubmissionResults(int[] counter, String[] questionChoice)
    {
        for (int i = 0; i < questionChoice.length; i++)
        {
            System.out.println(questionChoice[i] + " : " + counter[i]);
        }
    }

}
