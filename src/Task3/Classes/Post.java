package Task3.Classes;

import java.util.Scanner;

public class Post {
    private String imageUrl;
    private String description;
    private Long idPost;
//***********************************************************************************************************
    public Post() {
    }
    public Post(String imageUrl, String description, Long idPost) {
        this.imageUrl = imageUrl;
        this.description = description;
        this.idPost = idPost;
    }
//***********************************************************************************************************
    public String getImageUrl() {return imageUrl;}
    public void setImageUrl(String imageUrl) {this.imageUrl = imageUrl;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public Long getIdPost() {return idPost;}
    public void setIdPost(Long idPost) {this.idPost = idPost;}
//***********************************************************************************************************

    @Override
    public String toString() {
        return "Post:\n" +
                "\n     imageUrl -> " + imageUrl  +
                "\n     description -> " + description  +
                "\n     idPost -> " + idPost;
    }
    public static Post getPost (){
        Post post = new Post();
        System.out.print("Enter Image Url: ");
        post.setImageUrl(new Scanner(System.in).nextLine());
        System.out.print("Write description post: ");
        post.setDescription(new Scanner(System.in).nextLine());
        post.setIdPost(Generated.idUnique());
        return post;
    }
}
