class Anu {

	private int age;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	private String gender;

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Anu a = new Anu();
		
		a.setAge(20);
		a.setName("Anusha");
		a.setGender("female");
		System.out.println(a.getAge());
		System.out.println(a.getGender());
		System.out.println(a.getName());
	}

}
