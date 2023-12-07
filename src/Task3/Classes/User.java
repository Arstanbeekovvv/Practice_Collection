package Task3.Classes;

import Task3.Classes.Gender;
import Task3.Service.PostService;

import java.util.LinkedList;

public class User {
    private String email;
    private String password;
    private  String fullName;
    private Gender gender;
    private Long idUser;
    private LinkedList<Post> posts = new LinkedList<>();
//**********************************************************************************************************
    public User() {
    }
    public User(String email, String password, String fullName, Gender gender, Long idUser) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.gender = gender;
        this.idUser = idUser;
    }
//**********************************************************************************************************
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public String getFullName() {return fullName;}
    public void setFullName(String fullName) {this.fullName = fullName;}
    public Gender getGender() {return gender;}
    public void setGender(Gender gender) {this.gender = gender;}
    public Long getIdUser() {return idUser;}
    public void setIdUser(Long idUser) {this.idUser = idUser;}
    public LinkedList<Post> getPosts() {return posts;}
    public void setPosts(LinkedList<Post> posts) {this.posts = posts;}
//**********************************************************************************************************

    @Override
    public String toString() {
        return "User:\n" +
                "\n     email -> " + email  +
                "\n     password -> " + password +
                "\n     fullName -> " + fullName  +
                "\n     gender -> " + gender +
                "\n     idUser -> " + idUser +
                "\n     posts siz -> " + posts.size();
    }
}
