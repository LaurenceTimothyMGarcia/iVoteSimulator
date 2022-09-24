public class VotingService implements Question
{
    private int[] mcCounter = {0, 0, 0, 0, 0, 0};
    private int[] tfCounter = {0, 0};

    private Student studentAns = new Student();

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
