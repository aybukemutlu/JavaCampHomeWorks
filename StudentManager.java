package Day3Homework;

public class StudentManager extends UserManager {
    public void bringExamResult(User user){
        System.out.println(user.getFirstName()+" 'in sınav sonucu geldi !!!");
    }
}
