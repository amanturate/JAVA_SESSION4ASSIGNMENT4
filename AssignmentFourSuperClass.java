
public class AssignmentFourSuperClass {
	
	int value1;
	int value2;
	// Constructor Chaining
	
	public AssignmentFourSuperClass() {
		System.out.println("Default Constructor of super class");
	}
	
	public AssignmentFourSuperClass(int value1){
		this.value1 = value1;
		System.out.println("Value Passed is " + value1);
	}
	
	public AssignmentFourSuperClass(int value1, int value2){
		this.value1 = value1;
		this.value2 = value2;
		System.out.println("Values Passed are " + value1 + " and " + value2);
	}

}
