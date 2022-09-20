public class Question implements Answers
{
    private char[] multiChoice;
    private int mcAnswer;
    private boolean trueFalse;

    public Question(boolean tF)
    {
        trueFalse = tF;
    }

    public Question(char[] mc, int answer)
    {
        multiChoice = mc;
        mcAnswer = answer;
    }

    public char[] getMCQuestion()
    {
        return multiChoice;
    }

    public int getMCAnswer()
    {
        return mcAnswer;
    }

    public boolean getTrueFalse()
    {
        return trueFalse;
    }
}
