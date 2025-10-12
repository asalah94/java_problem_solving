package learning.collection;

import java.util.HashSet;
import java.util.Set;

public class SetProblems{

    public  static  void avoidDuplicates() {
        Set<String> setName = new HashSet<>();
        setName.add("ahmed");
        setName.add("mohamed");
        if(!setName.add("ahmed")){
            System.out.println("value is exist");
        }

    }

    Set<String> registeredEmails = new HashSet<>();

    public  boolean registerUser(String email) {
        registeredEmails.add("ahmsalah.elsayed@gmail.com");
        if (registeredEmails.contains(email)){
            System.out.println("email is registered");
            return false;
        }
        registeredEmails.add(email);
        System.out.println("user registered");
        return true;
    }

    public static void main(String[] args) {
        SetProblems.avoidDuplicates();
        SetProblems setProblems  = new SetProblems();
        setProblems.registerUser("ahmsalah.elsayed@gmail.com");
    }


}
