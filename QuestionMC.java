/***
 * 
 * Question Multiple Choice Subclass
 * 
***/

public class QuestionMC implements Question
{
    private String[] choiceMC = new String[6];

    private String question;

    public QuestionMC(String quest, String a1, String a2, String a3, String a4, String a5, String a6)
    {
        question = quest;
        choiceMC[0] = a1;
        choiceMC[1] = a2;
        choiceMC[2] = a3;
        choiceMC[3] = a4;
        choiceMC[4] = a5;
        choiceMC[5] = a6;
    }

    //Prints the question for display for the user
    public void printQuestion()
    {
        System.out.println(question);
    }

    //Displays the choices for the user; From A-F
    public void printChoice()
    {
        System.out.println("Pick one or more of the following");

        for (int i = 0; i < choiceMC.length; i++)
        {
            System.out.println(choiceMC[i]);
        }
    }

    //Accessor Methods
    public String getChoice(int numInArr)
    {
        return choiceMC[numInArr];
    }
    public String[] getOptions()
    {
        return choiceMC;
    }
}
