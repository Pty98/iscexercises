package ir.freeland.lambda;

public class Person {
    	
    private String name;
    private double grade;
    private int age;
    
  

    public Person(String name, double grade, int age) {
		super();
		this.name = name;
		this.grade = grade;
		this.age = age;
	}



	public String getName() {
        return name;
    }

  

    public int getAge() {
        return age;
    }
    
    public void setName(String name) {
    	this.name = name;
		
	}


	

	public double getGrade() {
		return grade;
	}



	public void setGrade(double grade) {
		this.grade = grade;
	}



	public void setAge(int age) {
		this.age = age;
	}

	@Override
    public String toString() {
        return "Person{ name=" + name + ", grade=" + grade + ", age=" + age + "}";
    }


}
