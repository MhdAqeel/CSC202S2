import java.util.ArrayList;
public class Q3{
	public static void main(String [] args){
		ArrayList <Student> list = new ArrayList<>();
	
		list.add(new Student("John Doe" , 18 , 85.5));
		list.add(new Student("Jane Smith" , 17 , 92));
		list.add(new Student("Michel Jackson" , 19 , 78.3));
		
		for(Student s : list){
			System.out.println(s.getName());
			System.out.println(s.getAge());
			System.out.println(s.getMarks());
			System.out.println("-------------");
		}
		
		for(Student s: list){
			if(s.getName().equals("John Doe")) {
				s.setMarks(90.2);
				break;
			}
		}
		
		Student janeSmith =null;
		for(Student s: list){
			if(s.getName().equals("John Doe")) {
				janeSmith = s;
			}
		}
		list.remove(janeSmith);
		
		
		System.out.println("after modification");
		for(Student s : list){
			System.out.println(s.getName());
			System.out.println(s.getAge());
			System.out.println(s.getMarks());
			System.out.println("-------------");
		}
		
	}
	
	
}

class Student{
	private String name;
	private int age;
	private double marks;
	
	public Student(String name,int age,double marks){
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	public double getMarks(){
		return marks;
	}
	
	public void setMarks(double marks){
		this.marks=marks;
	}
}
