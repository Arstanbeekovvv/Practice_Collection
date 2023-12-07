package Task3;

import Task3.Classes.Generated;
import Task3.Classes.Post;
import Task3.Classes.User;
import Task3.Service.PostService;
import Task3.Service.PostServiceImpl;
import Task3.Service.UserService;
import Task3.Service.UserServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService us = new UserServiceImpl();
        PostService ps = new PostServiceImpl();
        System.out.print("""
                1. Registration
                2. Login
                3. Get user by email
                4. Get all Users
                5. Add post to user
                6. Delete post by id
                7. Get all post by user id
             your choice:   """);
        String choice = new Scanner(System.in).nextLine();
        User user = new User();
        while(true) {
            switch (choice) {
                case "1" -> {
                    us.register();
                }
                case "2" -> {
                    user = us.login();
                }
                case "3" -> {
                    us.getUserByEmail();
                }
                case "4" -> {
                    us.getAllUsers();
                }
                case "5" -> {
                    ps.addPostToUser(user, Post.getPost());
                }
                case "6" -> {
                    System.out.print("Enter id post for delete post: ");
                    ps.deletePostById(user, new Scanner(System.in).nextLong());
                }
                case "7" -> {
                    System.out.print("Enter id user for get all post users: ");
                    ps.getAllPostByUserId(new Scanner(System.in).nextLong());
                }
                case "0" -> {
                    return;
                }
            }
        }
    }
}
