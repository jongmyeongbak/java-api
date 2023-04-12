package anotherpackage;

import otherpackage.Parent;

public class GrandParent {

	protected GrandParent protectedTestMethod() {
		System.out.println("GrandParent");
		return this;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException  {
		Parent parent = new Parent();
		parent.protectedTestMethod();
		
		Child child = new Child();
		child.protectedTestMethod();
		child.protectedChild();
	}

//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
	
	
}
