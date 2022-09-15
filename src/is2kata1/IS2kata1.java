package is2kata1;

import java.util.Date;

public class IS2kata1 {


    public static void main(String[] args) {
        Person person = new Person("Fulanito", new Date(100,5,19));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
    
}
