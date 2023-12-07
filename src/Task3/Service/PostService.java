package Task3.Service;

import Task3.Classes.Post;
import Task3.Classes.User;

public interface PostService {
    void addPostToUser(User user, Post post);
    void deletePostById(User user, Long idPost);
    void getAllPostByUserId(Long idUser);
}
