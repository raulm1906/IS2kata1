package is2kata1;

import java.time.LocalDate;

public class IS2kata1 {

    
    public static void main(String[] args) {
        LocalDate date;
        date = LocalDate.of(2000, 6, 19);
        
        Person person = new Person("Fulanito", date);
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
    
}
