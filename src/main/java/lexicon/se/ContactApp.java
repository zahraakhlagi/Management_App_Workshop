package lexicon.se;

import java.util.ArrayList;
import java.util.List;

public class ContactApp {
         void main() {
             boolean continueCreating=true;
             while (continueCreating){
                 createNewContact();
                 String input= IO.readln("Do you want to create a new contact: (yes/no) ");
                 if (input.equalsIgnoreCase("no")){
                     continueCreating=false;
                 }
                 sortListByName();
                 printAllContact();
                 findPersonByFirstname();
                 editPerson(findPersonByFirstname());

             }



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
            //IO.println(String.format());
            IO.println(person.firsName);
            IO.println(person.lastName);
            IO.println(person.phoneNumber);
            IO.println(person.email);
        }

        }

    void sortListByName(){
        list.sort((Person a1, Person a2)->a1.firsName.compareTo(a2.firsName));
    }

    Person findPersonByFirstname(){
        String name= IO.readln("name of person: ");
        for(Person person:list){
            if(person.firsName.equalsIgnoreCase(name)){
                return person;
            }
        }
        IO.println("Could not find a contact with firstname "+ name);
        return null;
    }

    void editPerson(Person person){
        person.firsName= IO.readln("new firstname : ");
        person.lastName = IO.readln("new lastname : ");
        person.phoneNumber= IO.readln("new phone number : ");
        person.email= IO.readln("new email: ");
    }

    void deletePerson(){
        Person person= findPersonByFirstname();
        if (person.equals(null)){
            IO.println("person not found:");
            return;
        }
        list.remove(person);
    }
}
