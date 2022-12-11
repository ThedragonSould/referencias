package app;
import java.security.Permission;

import model.Person;
import model.PersonDAO;


public class App {
    public static void main(String[] args) throws Exception {
      
        PersonDAO model = new PersonDAO();

        Person person = new Person();


        person.Set id_numb(1234);
        person.Set  id_type("Cedula de identidad");
        person. Set setNamen("Juan marco");
        person. Set last_namen("jimenez");
        Person. setDia_de_nacimiento Dia_de_nacimiento(" 1995/06/06");
        person. Set email("Templario1@gmail.com");
        person. Set  telefono("0254062025");





        if(model.addperson(person));
            System.out.println("guardado");
        else{
            System.out.println("no guardado");
        }



    }
}
