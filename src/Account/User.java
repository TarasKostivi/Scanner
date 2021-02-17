package Account;

public class User {
    private String name;
    private String someName;
    private int age;

    public User(String name, String someName, int age) throws IllegalAccessException {

        if ((int)age < 16){
            throw new IllegalAccessException("Person should be older than 16");
        }

        this.name = name;
        this.someName = someName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSomeName() {
        return someName;
    }

    public void setSomeName(String someName) {
        this.someName = someName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
