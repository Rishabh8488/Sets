import java.util.*;
class Set1
{
	public static void main(String arg[])
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(101);
		hs.add(107);
		hs.add(104);
		hs.add(109);
		hs.add(107);
		System.out.println("Set Value");
		Iterator it=hs.iterator();		//Only Iterator can be used since it cannot be accessed by Position.
		while(it.hasNext())
		{
			int x=(int)it.next();
			System.out.println(x);
		}
	}
}