package Day3Homework;

public class UserManager {
    

    public void logIn(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kişi sisteme giriş yaptı");

    }
    public void logOut(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kişi sistemden çıkış yaptı");

    }
    public void deleteUser(User user){
        System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kişi sistemden silindi");
    }
    public void add(User user){
        System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kişi sisteme eklendi");
    }
}
