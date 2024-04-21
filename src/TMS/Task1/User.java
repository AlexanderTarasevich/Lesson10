package TMS.Task1;

import java.util.Objects;

public class User {
    private String name;
    private int password;

    public User(String name, int password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,password);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return password == user.password && Objects.equals(name, user.name);
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + " password=" + password + '}';
    }
}



