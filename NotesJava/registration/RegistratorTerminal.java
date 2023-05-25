package SeminarOOP6.NotesJava.registration;

import java.time.LocalDateTime;

public class RegistratorTerminal implements RegistratorAble{
    @Override
    public void logg(String msg) {
        System.out.println(LocalDateTime.now() + msg);
    }
    
}
