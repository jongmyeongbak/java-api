package otherpackage;

import anotherpackage.Child;
import anotherpackage.GrandParent;

public class Parent extends GrandParent implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		Parent parent = new Parent();
		Parent parent2 = (Parent) parent.protectedTestMethod();
		Parent parentCloned = (Parent) parent.clone();
		
		Child child = new Child();
		Child childCloned = (Child) child.clone();
	}

//	@Override
//	protected GrandParent protectedTestMethod() {
//		// TODO Auto-generated method stub
//		return super.protectedTestMethod();
//	}

//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
	
	
}
