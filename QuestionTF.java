public class QuestionTF implements Question
{
    private String[] choiceTF = {"1. True", "2. False"};
    private int[] counterTF = {0, 0};

    //Prints the question for display for the user
    public void PrintQuestion()
    {

    }

    //Displays the choices for the user
    public void PrintChoice()
    {
        System.out.println("True or False?");

        System.out.println(choiceTF[0]);
        System.out.println(choiceTF[1]);
    }

    //Counts how many times a student selected that number
    public void AddCounter(boolean[] selected)
    {
        //Input validation to check if only one is selected
        if (selected[0] == selected[1])
        {
            return;
        }

        if (selected[0])
        {
            counterTF[0]++;
        }
        else if (selected[1])
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
