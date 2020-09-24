package dataStrcuture;

public class A {



	  public String concatenation(String... str) {
		  String resultat ="";
		  for(String s:str) {
			  resultat+=s;
		  }
		  return resultat;
	  }

	  public static void main(String[] args) {
		 A test =new A();
	    System.out.println(test.concatenation("d","f"));
	  }
}
