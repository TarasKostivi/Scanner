package Theard;
import java.util.List;

public class PeopleQeue extends Thread
{
    private List<String> people;
    private long sleapTime;

    public PeopleQeue(List<String> people,  long sleapTime){
        this.people = people;
        this.sleapTime = sleapTime;
    }

    @Override
    public void run(){
        for (String person : people){
            System.out.println(Thread.currentThread().getName() + " :: " + person);
            try {
                sleep(sleapTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
