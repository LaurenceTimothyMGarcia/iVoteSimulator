public class QuestionMC implements Question
{
    private String[] choiceMC = {"A", "B", "C", "D", "E", "F"};

    private String question;

    public QuestionMC(String quest)
    {
        question = quest;
    }

    //Prints the question for display for the user
    public void PrintQuestion()
    {
        System.out.println(question);
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

    //Accessor Methods
    public String GetChoice(int numInArr)
    {
        return choiceMC[numInArr];
    }
}
