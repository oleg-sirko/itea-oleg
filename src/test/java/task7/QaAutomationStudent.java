package task7;

public class QaAutomationStudent extends Student{
    public QaAutomationStudent(String name){
        super(name);
    }
    @Override
    public void runHomeTask() {
        System.out.println(getName() + " is coding");
    }


}
