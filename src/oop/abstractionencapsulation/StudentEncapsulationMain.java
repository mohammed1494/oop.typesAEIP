package oop.abstractionencapsulation;

public class StudentEncapsulationMain {

	public static void main(String[] args) {
		
		StudentEncapsulation st1 = new StudentEncapsulation();
		st1.setStName("Mahi");
		st1.setStId(105);
		st1.setStDOB("10-9-98");
		st1.setStGrade('A');
		
		StudentEncapsulation st3 = new StudentEncapsulation();
		st3.setStName("Rashid");
		System.out.println(st3.getStName());
		
		System.out.println(st1.getStName() + " " + st1.getStId() + " " +st1.getStGrade() + " " + st1.getStDOB());
	
	StudentEncapsulation st2 = new StudentEncapsulation("Shaq", 102, 'B', "10-2-96"); 
	
	System.out.println(st2.getStName() + " " + st2.getStId() + " " +st2.getStGrade() + " " + st2.getStDOB());
	
	}	
}
