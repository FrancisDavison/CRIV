import java.util.ArrayList;

public class Question_1
{
	public static void main(String args[])
	{
		ArrayList<Integer> rep = new ArrayList<Integer>();
		/*
		rep.add(1);
		rep.add(0);
		rep.add(1);
		rep.add(0);
		rep.add(1);
		rep.add(0);
		rep.add(1);
		rep.add(0);
		rep.add(1);
		rep.add(0);
		*/
		OneMaxFitness(rep);
	}
	
	public static double OneMaxFitness(ArrayList<Integer> rep)
	{
		double Test1=-1;
		double Test2=-2;
		int n=rep.size();
		if(rep.isEmpty()==true)
		{
			return Test1;
		}
		if(rep!=null)
		{
			for(int i=0;i<n;i++)
			{
				if(rep.get(i)!=0&&rep.get(i)!=1)
				{
					return Test2;
				}
			}
		}
		return Test1;
	}
}