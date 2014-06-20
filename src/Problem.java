
public class Problem 
{
	String question;
	String correnctAns;
	String[] choices = new String[4];
	
	public Problem(String q, String a, String[] choiceBox)
	{
		question = q;
		correnctAns = a;	
	}
	public String getQuestion()
	{
		return question;
	}
	public String getCorrectAnswer()
	{
		return correnctAns + " ";
	}
	public void setQuestion(String q)
	{
		question = q;
	}
	public void serAnswer(String  a)
	{
		correnctAns = a;
	}
}
