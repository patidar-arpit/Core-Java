class Alpha 
{ 
	static String s = " "; 
	protected Alpha() 
	{ 
		s += "alpha "; 
	} 
} 
class SubAlpha extends Alpha 
{ 
	private SubAlpha() 
	{ 
		s += "sub "; 
	} 
} 

public class constr extends Alpha 
{ 
	private constr() 
	{ 
		s += "subsub "; 
	} 
	public static void main(String[] args) 
	{ 
		new constr(); 
		System.out.println(s); 
	} 
} 
