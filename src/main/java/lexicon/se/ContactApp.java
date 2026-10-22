package lexicon.se;

import java.util.ArrayList;
import java.util.List;

public class ContactApp {
         void main() {
        createNewContact();
        createNewContact();
        printAllContact();

    }
    ArrayList <Person> list= new ArrayList<>();
    void createNewContact(){
        Person newPerson= new Person();
        newPerson.firsName= IO.readln("Enter firstname: ");
        newPerson.lastName= IO.readln("Enter lastname: ");
        newPerson.phoneNumber= IO.readln("Enter phone number: ");
        newPerson.email= IO.readln("Enter email: ");

        list.add(newPerson);

    }
    void printAllContact(){
        for(Person person:list){
            IO.println(person.firsName);
            IO.println(person.lastName);
            IO.println(person.phoneNumber);
            IO.println(person.email);
        }
    }
}
