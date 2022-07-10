package task7;

public class QaAutomationStudent extends Student{
    public QaAutomationStudent(String name, boolean coding){
        super(name, coding);
    }
    @Override
    public void runHomeTask() {
        System.out.println(getName()+ " is coding");

    }

}
