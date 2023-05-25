package SeminarOOP6.NotesJava;

import SeminarOOP6.NotesJava.registration.Decoration;
// import SeminarOOP6.NotesJava.registration.RegistratorAble;
import SeminarOOP6.NotesJava.registration.RegistratorTerminal;
import SeminarOOP6.NotesJava.model.FileOperation;
import SeminarOOP6.NotesJava.model.FileOperationImpl;
import SeminarOOP6.NotesJava.model.Repository;
import SeminarOOP6.NotesJava.model.FileRepository;
import SeminarOOP6.NotesJava.utils.Validate;
import SeminarOOP6.NotesJava.views.ViewUser;
import SeminarOOP6.NotesJava.controllers.Controller;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl(
                "/E/Java/Seminar6OOP/SeminarOOP6/NotesJava/users.txt");
        // Repository repository = new FileRepository(fileOperation);
        Repository repository = new Decoration(new FileRepository(fileOperation), new RegistratorTerminal());
        Validate validate = new Validate();
        Controller controller = new Controller(repository, validate);
        ViewUser view = new ViewUser(controller, validate);

        view.run();
    }

}