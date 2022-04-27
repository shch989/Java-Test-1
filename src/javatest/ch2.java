package javatest;

public class ch2 {
	
	private int id;
	private String name;
	private String description;
	private String test;
	

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
	
	public void printMember() {
		System.out.println("안녕하세요");
	}


	public void Info() {
		
		System.out.println("id : " + id);
		System.out.println("name : " + name);
		System.out.println("description : " + description);
		System.out.println("test : " + test);	
	}
	

}
