package task7;

import session7.Animal;
import session7.Dog;
import session7.Tiger;

import javax.xml.namespace.QName;

public class Program {

    public static void main(String[] args) {

        Student student = new Student("Oleg");
        QaAutomationStudent qaAutomationStudent = new QaAutomationStudent ("Mary");
        student.runHomeTask();
        qaAutomationStudent.runHomeTask();

    }
}

