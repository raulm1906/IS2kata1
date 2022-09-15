package is2kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class IS2kata1 {

    
    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(2000, 6, 19);
        
        Person person = new Person("Fulanito", date);
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
    
}
