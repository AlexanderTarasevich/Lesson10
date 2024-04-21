package TMS.TaskStar;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User originalUser = new User(10,"Bob");
        User shallowClone= (User) originalUser.clone();
        User deepClone= originalUser.deepClone();
        System.out.println(originalUser == deepClone);
    }
}
