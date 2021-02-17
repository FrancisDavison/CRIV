import java.util.ArrayList;
public class Question_2
{
	public static void main(String args[])
	{
		ArrayList<Integer> rep = new ArrayList<Integer>();
		rep.add(1);
		rep.add(0);
		
	}
	
	public static double OneMaxFitness(ArrayList<Integer> rep){
		try {
			if( rep.isEmpty() || rep == null)
				return -1.0;
			for(int i=0; i<rep.size(); i++)
			{
				if(rep.get(i) != 0 && rep.get(i) != 1)
					return -2.0;
			}
			double fitness = 0;
		    for( int i = 0; i<rep.size(); ++i)
		    {
		         fitness += rep.get(i);
		    }
		    return fitness;
			
		}
		catch(java.lang.NullPointerException e) {
            return -1.0;
        }
	}
}