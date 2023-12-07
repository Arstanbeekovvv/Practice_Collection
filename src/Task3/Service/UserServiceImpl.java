package Task3.Service;

import Task3.Classes.Gender;
import Task3.Classes.Generated;
import Task3.Classes.User;
import Task3.DataBase.DB;

import java.util.Scanner;

public class UserServiceImpl implements UserService {
    @Override
    public void register() {
        User user = new User();
        System.out.print("Enter your full name -> ");
        user.setFullName(new Scanner(System.in).nextLine());
        boolean isTrue = true;
        while(isTrue) {
            System.out.print("Enter your unique email -> ");
            String setEmail = (new Scanner(System.in).nextLine());
            if(setEmail.endsWith("@gmail.com") && setEmail.length() > 10){
                for (int i = 0; i < DB.users.size(); i++) {
                    if(DB.users.get(i).getEmail().equals(setEmail)){
                        System.out.println("This email already busy!!!");
                    }
                    if(i == DB.users.size()-1 && isTrue){
                        user.setEmail(setEmail);
                        isTrue = false;
                    }
                }
            }
        }
        boolean isTrues = true;
        while (isTrues) {
            System.out.print("Enter your password -> ");
            String setPassword = (new Scanner(System.in).nextLine());
            if(setPassword.length() > 4){
                user.setPassword(setPassword);
            }else System.out.println("The password must be 4 sizes long!!!");
        }
        System.out.print("Enter your full name -> ");
        String gender = new Scanner(System.in).nextLine();
        if(gender.contains(Gender.MALE.name())) user.setGender(Gender.MALE);
        if(gender.contains(Gender.MALE.name())) user.setGender(Gender.FEMALE);
        user.setIdUser(Generated.idUnique());
        DB.users.add(user);
    }

    @Override
    public User login() {
        while (true) {
            System.out.print("Enter your email -> ");
            String email = new Scanner(System.in).nextLine();
            System.out.print("Enter your password -> ");
            String password = new Scanner(System.in).nextLine();
            if (email.endsWith("@gmail.com") && email.length() >= 11 && password.length() > 4) {
                for (int i = 0; i < DB.users.size(); i++) {
                    if (DB.users.get(i).getEmail().equals(email) && DB.users.get(i).getPassword().equals(password)) {
                        return DB.users.get(i);
                    }
                }
            }else System.out.println("Invalid email or password !!!");
        }
    }

    @Override
    public void getUserByEmail() {
        System.out.print("Enter email: ");
        String email = new Scanner(System.in).nextLine();
        for (int i = 0; i < DB.users.size(); i++) {
            if(DB.users.get(i).getEmail().equals(email)){
                System.out.println(DB.users.get(i));
                return;
            }
        }
        System.out.println("Not found email!!!");
    }

    @Override
    public void getAllUsers() {
        for (int i = 0; i < DB.users.size(); i++) {
            System.out.println(DB.users.get(i));
        }
        if(DB.users.isEmpty()){
            System.out.println("User size = 0!!!");
        }
    }
}
