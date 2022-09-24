public class QuestionTF implements Question
{
    private String[] choiceTF = {"1. True", "2. False"};
    private int[] counterTF = {0, 0};

    private String question;

    public QuestionTF(String quest)
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
        System.out.println("True or False?");

        System.out.println(choiceTF[0]);
        System.out.println(choiceTF[1]);
    }

    //Counts how many times a student selected that number
    @Override public void AddCounter(boolean selected)
    {
        if (selected)
        {
            counterTF[0]++;
        }
        else
        {
            counterTF[1]++;
        }
    }

    //Accessor Methods
    public String GetChoice(int numInArr)
    {
        return choiceTF[numInArr];
    }

    public int GetCounter(int numInArr)
    {
        return counterTF[numInArr];
    }
}
