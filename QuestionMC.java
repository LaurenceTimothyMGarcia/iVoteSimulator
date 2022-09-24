public class QuestionMC implements Question
{
    private String[] choiceMC = {"A", "B", "C", "D", "E", "F"};
    private int[] counterMC = {0, 0, 0, 0, 0, 0};

    //Prints the question for display for the user
    public void PrintQuestion()
    {

    }

    //Displays the choices for the user
    public void PrintChoice()
    {
        System.out.println("Pick one or more of the following");

        for (int i = 0; i < choiceMC.length; i++)
        {
            System.out.println(choiceMC[i]);
        }
    }

    //Counts how many times a student selected that number
    public void AddCounter()
    {

    }

    //Accessor Methods
    public String GetChoice(int numInArr)
    {
        return choiceMC[numInArr];
    }

    public int GetCounter(int numInArr)
    {
        return counterMC[numInArr];
    }
}
