import java.util.*;
class Set1
{
	public static void main(String arg[])
	{
		TreeSet<String> hs=new TreeSet<String>();
		hs.add("india");
		hs.add("lanka");
		hs.add("bangla");
		hs.add("nepal");
		hs.add("bhutan");
		System.out.println("Set Value");
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			String x=(String)it.next();
			System.out.println(x);
		}
	}
}