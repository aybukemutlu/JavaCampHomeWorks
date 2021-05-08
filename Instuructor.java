package Day3Homework;

public class Instuructor extends User {
    private String[] courses;
    public Instuructor() {
		super();
		courses = new String[0];
	}

    public Instuructor(String[] courses) {
        super();
        this.courses = courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String[] getCourses() {
        return courses;
    }
}
