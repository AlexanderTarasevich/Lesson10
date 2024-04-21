package TMS.TaskStar;

public class User implements Cloneable {
    private String name;
    private int id;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }


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


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public User deepClone() throws CloneNotSupportedException {
        User clonedUser = (User) super.clone();
        return clonedUser;
    }
}


