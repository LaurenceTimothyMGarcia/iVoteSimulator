public class VotingService implements Question
{
    private int[] mcCounter = {0, 0, 0, 0, 0, 0};
    private int[] tfCounter = {0, 0};

    private Student studentAns;

    public void AddCounter(String mc)
    {
        for (int i = 0; i < multiChoice.length; i++)
        {
            if (multiChoice[i] == studentAns.getMCAnswer())
            {
                mcCounter[i]++;
                break;
            }
        }
    }

    public void AddCounter(int tf)
    {
        for (int i = 0; i < tfCounter.length; i++)
        {
            if (i == studentAns.getTFAnswer())
            {
                tfCounter[i]++;
                break;
            }
        }
    }

    public void SubmissionResults(int[] counter, String[] questionChoice)
    {
        for (int i = 0; i < questionChoice.length; i++)
        {
            System.out.println(questionChoice[i] + " " + counter[i]);
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
