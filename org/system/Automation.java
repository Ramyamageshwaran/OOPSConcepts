package org.system;

public class Automation extends MultipleLanguage implements Language,TestTool  {
	
	public void ruby() {
		
		System.out.println("Rudy is a Programming Language from Japan");
		
	}

	public void selenium() {
		System.out.println("Selenium is top most tool in Automation Testing");
		
	}

	public void java() {
		
		System.out.println("Java is Motherhood Language in Selenium");
	}
	
	public void python()
	{
			   System.out.println("Python is a popular programming language");
	}
	public static void main(String[] args) {
		Automation auto=new Automation();
		auto.ruby();
		auto.selenium();
		auto.java();
		auto.python();

	}


}
