public class Person<T extends Comparable> {
    private String name;
    private String someName;
    private T age;

    public Person(String name, String someName, T age) throws IllegalAccessException {

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

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }
}
