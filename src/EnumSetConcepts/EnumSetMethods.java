package EnumSetConcepts;

import java.util.EnumSet;

public class EnumSetMethods {

	enum Lang
	{
		JAVA , C , PYTHON , GO 
	}
	public static void main(String[] args) {
		
		//allOf
		EnumSet<Lang> es1 = EnumSet.allOf(Lang.class);
		System.out.println(es1);// [JAVA, C, PYTHON, GO]
		
		System.out.println("-----");
		
		//Of
		EnumSet<Lang> es2 = EnumSet.of(Lang.JAVA);
		System.out.println(es2);// [JAVA]
		
		EnumSet<Lang> es3 = EnumSet.of(Lang.JAVA , Lang.GO);
		System.out.println(es3);// [JAVA, GO]
		
		System.out.println("-----");
		
		//noneOf
		EnumSet<Lang> es4 = EnumSet.noneOf(Lang.class);
		System.out.println(es4);// []
		
		System.out.println("-----");
		
		//range
		EnumSet<Lang> es5 = EnumSet.range(Lang.JAVA , Lang.PYTHON);
		System.out.println(es5);// [JAVA, C, PYTHON]
		
		System.out.println("-----");
		
		//add , addAll
		es4.add(Lang.GO);
		es4.addAll(es1);
		System.out.println(es4);// [JAVA, C, PYTHON, GO]
		
		System.out.println("-----");
		
		//remove , removeAll
		es4.remove(Lang.GO);
		System.out.println(es4);// [JAVA, C, PYTHON]
		es4.removeAll(es4);
		System.out.println(es4);// []
		
	}
}
