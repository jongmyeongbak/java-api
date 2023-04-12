package anotherpackage;

import otherpackage.Parent;

public class Child extends Parent {

	public static void main(String[] args) throws CloneNotSupportedException  {
		GrandParent grandParent = new GrandParent();
		grandParent.protectedTestMethod();
		
		Parent parent = new Parent();
		Parent parent2 = (Parent) parent.protectedTestMethod(); // 정상
//		Parent parentCloned = (Parent) parent.clone(); // The method clone() from the type Object is not visible
	}
	
	protected Child protectedChild() {
		System.out.println("Child");
		return this;
	}
}
