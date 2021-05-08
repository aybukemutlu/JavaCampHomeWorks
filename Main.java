package Day3Homework;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Aybüke");
        student.setLastName("Mutlu");
        student.setEmail("aybukemutlu@gmail.com");
        student.setExamResult("100");
        student.setPassword("ay");

        StudentManager studentManager = new StudentManager();
        studentManager.bringExamResult(student);

        Instuructor instuructor = new Instuructor();
        instuructor.setFirstName("Engin");
        instuructor.setLastName("Demiroğ");
        instuructor.setEmail("engindemigog@gmail.com");
        instuructor.setPassword("en");

        String courses1 = "java";
        String courses2 = "python";
        String courses3 = "c++";

        InstructorManager instructorManager = new InstructorManager();

        instructorManager.addCourse(instuructor, courses1);
        instructorManager.addCourse(instuructor, courses2);
        instructorManager.addCourse(instuructor, courses3);

    }
}
