package firstproject;

public class Student {
	
    public int rollNomber;
    
	public  String name;
	
	public int age;
	
	public String gender;
	
	public Student () {
		
	}

	public int getRollNomber() {
		return rollNomber;
	}

	public void setRollNomber(int rollNomber) {
		this.rollNomber = rollNomber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Student(int rollNomber, String name, int age, String gender) {
		super();
		this.rollNomber = rollNomber;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [rollNomber=" + rollNomber + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	 

}
