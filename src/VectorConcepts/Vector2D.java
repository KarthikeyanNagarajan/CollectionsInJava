package VectorConcepts;

import java.util.Vector;

public class Vector2D {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("abc");
		v.add("pqr");
		v.add("xyz");
		Vector v1 = new Vector();
		v1.add(v);
		for(int i=0; i<v.size();i++)
		{
			String str = (String)((Vector)v1.get(0)).get(i);
			System.out.println(str);
		}
	}

}
