public class VotingService implements Question
{
    private int[] mcCounter = {0, 0, 0, 0, 0, 0};
    private int[] tfCounter = {0, 0};

    private String[] unqiueID;
    private Student studentAns;

    public void AddCounter(String id, String mc)
    {
        for (int i = 0; i < multiChoice.length; i++)
        {
            if (multiChoice[i] == mc)
            {
                mcCounter[i]++;
                break;
            }
        }
    }

    public void AddCounter(String id, int tf)
    {
        if (tf == 1)
        {
            tfCounter[0]++;
        }
        else if (tf == 2)
        {
            tfCounter[1]++;
        }
    }

    public void SubmissionResults(int[] counter, String[] questionChoice)
    {
        for (int i = 0; i < questionChoice.length; i++)
        {
            System.out.println(questionChoice[i] + " : " + counter[i]);
        }
    }

    public void printChoice(String[] questionChoice)
    {
        System.out.println("Pick one of the following");

        for (int i = 0; i < questionChoice.length; i++)
        {
            System.out.println(questionChoice[i]);
        }
    }
}
