package TMS.Task1;

public class Main {
    public static void main(String[] args) {
        User user1= new User("Bob",1234);
        User user2= new User("Tom",1234);
        System.out.println(user1.equals(user2));
        System.out.println(user1.hashCode());
        System.out.println(user1);
    }
}
