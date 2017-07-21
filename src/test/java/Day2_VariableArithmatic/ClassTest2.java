package Day2_VariableArithmatic;

public class ClassTest2 extends ClassTest1 {
	 int num = 10;

	   // display method of sub class
	   public void display() {
	      System.out.println("This is the display method of subclass");
	      
	      ClassTest1 ct1 = new ClassTest1();
	      ct1.display();
	      super.display();
}
}
