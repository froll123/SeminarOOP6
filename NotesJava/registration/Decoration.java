package SeminarOOP6.NotesJava.registration;

import java.util.List;
import SeminarOOP6.NotesJava.model.Fields;
import SeminarOOP6.NotesJava.model.Repository;
import SeminarOOP6.NotesJava.model.User;

public class Decoration implements Repository{
    private Repository repo;
    private RegistratorTerminal logger;
    
    public Decoration(Repository repo, RegistratorTerminal logger) {
        this.repo = repo;
        this.logger = logger;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> res = repo.getAllUsers();
        return res;
    }

    @Override
    public String CreateUser(User user) {
        String res = repo.CreateUser(user);
        logger.logg("Date and time of create ");
        return res;
    }

    @Override
    public void UpdateUser(User user, Fields field, String param) {
        repo.UpdateUser(user, field, param);
    }

    @Override
    public void delUser(User user) {
        repo.delUser(user);
        logger.logg("Date & time of delete: ");
    }
    

    
}

