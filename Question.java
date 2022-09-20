public class Question
{
    //MC questions
    private char[] multiChoice;
    private int mcAnswer;

    //True false questions
    private boolean trueFalse;
    private boolean trueFalseAnswer;

    public Question(boolean tF, boolean tfAnswer)
    {
        trueFalse = tF;
        trueFalseAnswer = tfAnswer;
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

    public boolean getTFAnswer()
    {
        return trueFalseAnswer;
    }

    public void setAnswer(int mcAns)
    {
        mcAnswer = mcAns;
    }

    public void setAnswer(boolean tfAns)
    {
        trueFalseAnswer = tfAns;
    }
}
