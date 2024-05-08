class Student{
	private int marks;
	private String group;
	
	Student (int marks , String group){
		this.marks=marks;
		this.group=group;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		this.marks=marks;
	}
	
	public String getGroup() {
		return group;
	}
	
	public void setGroup(String group) {
		this.group=group;
	}
	
	
}
public class SingleInheritence extends Student {
	
	SingleInheritence(int marks, String group) {
		super(marks, group);
		System.out.println("group "   + group + " " + "marks" + " "  + marks);
	}

	public static void main(String[] args) {
		SingleInheritence s =new SingleInheritence(20, "CSC");
		
	}

}
