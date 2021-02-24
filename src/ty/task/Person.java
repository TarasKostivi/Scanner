package ty.task;

import java.time.Instant;

public class Person {
    private String name;
    private int agel;
    private Instant timestamp;

    public Person(String name, int agel) {
        this.name = name;
        this.agel = agel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgel() {
        return agel;
    }

    public void setAgel(int agel) {
        this.agel = agel;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return  name + " " + agel + " " + timestamp;
    }

}
