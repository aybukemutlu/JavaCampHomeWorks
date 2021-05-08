package Day3Homework;

public class Student extends User {
    private String examResult;

    public Student() {
        super();
        examResult = null;
    }

    public void setExamResult(String examResult) {
        this.examResult = examResult;
    }

    public String getExamResult() {
        return examResult;
    }
}
