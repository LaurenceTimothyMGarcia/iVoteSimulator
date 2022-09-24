public class VotingService
{
    private int[] mcCounter = {0, 0, 0, 0, 0, 0};
    private int[] tfCounter = {0, 0};

    private String[] uniqueID;
    private Student studentAns;

    public void SubmissionResults(int[] counter, String[] questionChoice)
    {
        for (int i = 0; i < questionChoice.length; i++)
        {
            System.out.println(questionChoice[i] + " : " + counter[i]);
        }
    }


}
