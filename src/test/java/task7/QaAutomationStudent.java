package task7;

public class QaAutomationStudent extends Student {  //подкласс наследует суперкласс
       // public String name;

        public QaAutomationStudent(String name) {

                super(name);
        }

        @Override
        public void runHomeTask()
        {
             System.out.println ("Masha is coding");
        }
}


