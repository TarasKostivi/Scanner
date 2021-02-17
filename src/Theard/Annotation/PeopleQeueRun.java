package Theard.Annotation;
import java.util.List;

public class PeopleQeueRun implements Runnable
{
    private List<String> people;
    private long sleapTime;

    public PeopleQeueRun(List<String> people, long sleapTime){
        this.people = people;
        this.sleapTime = sleapTime;
    }

    @Override
    public void run(){
        for (String person : people){
            System.out.println(Thread.currentThread().getName() + " :: " + person);
            try {
                Thread.sleep(sleapTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
