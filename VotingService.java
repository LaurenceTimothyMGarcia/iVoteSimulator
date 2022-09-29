/***
 * 
 * Voting Service Class
 *      Handles the students' answers and prints it
 * 
***/

import java.util.*;

public class VotingService
{
    //Holds all the id strings
    private HashMap<String, boolean[]> studentsList = new HashMap<String, boolean[]>();
    private Student randomAnswer = new Student();

    private QuestionTF trueFalse;
    private QuestionMC multipleChoice;

    private int[] counter;
    private final int[] countTF = {0, 0};
    private final int[] countMC = {0, 0, 0, 0, 0, 0};

    //Voting Service differs depending on type of question
    public VotingService(HashMap<String, boolean[]> stud, QuestionTF tf) //True and false
    {
        studentsList = stud;
        trueFalse = tf;
        counter = countTF;
    }
    
    public VotingService(HashMap<String, boolean[]> stud, QuestionMC mc) //Multiple select/choice
    {
        studentsList = stud;
        multipleChoice = mc;
        counter = countMC;
    }


    /*** Method to process votes ***/
    public void votingProcessMC()
    {
        multipleChoice.printQuestion();
        multipleChoice.printChoice();
        for (Map.Entry<String, boolean[]> set : studentsList.entrySet())
        {
            addCounter(set.getValue());
        }
        submissionResults(counter, multipleChoice.getOptions());

        //Randomize for new answers
        for (Map.Entry<String, boolean[]> set : studentsList.entrySet())
        {
            studentsList.put(set.getKey(), randomAnswer.randomAnswer());
        }
    }

    public void votingProcessTF()
    {
        trueFalse.printQuestion();
        trueFalse.printChoice();
        for (Map.Entry<String, boolean[]> set : studentsList.entrySet())
        {
            addCounter(set.getValue()[0]);
        }
        submissionResults(counter, trueFalse.getOptions());

        //Randomize for new answers
        for (Map.Entry<String, boolean[]> set : studentsList.entrySet())
        {
            studentsList.put(set.getKey(), randomAnswer.randomAnswer());
        }
    }

    //Prints out the results of how many students answered each one
    public void submissionResults(int[] counter, String[] questionChoice)
    {
        System.out.println("\nResults");
        for (int i = 0; i < questionChoice.length; i++)
        {
            System.out.println(questionChoice[i] + " : " + counter[i]);
        }
        System.out.println();
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
