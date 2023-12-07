package Task3.Service;

import Task3.Classes.Post;
import Task3.Classes.User;
import Task3.DataBase.DB;

public class PostServiceImpl implements PostService{


    @Override
    public void addPostToUser(User user, Post post) {
        for (int i1 = 0; i1 < DB.users.size(); i1++) {
            for (int j = 0; j < DB.users.get(i1).getPosts().size(); j++) {
                if(DB.users.get(i1).getPosts().get(j).getIdPost().equals(user.getIdUser())){
                    DB.users.get(i1).getPosts().add(post);
                    System.out.println("Successful add post ✅");
                    return;
                }
            }
        }
    }

    @Override
    public void deletePostById(User user, Long idPost) {
        for (int i = 0; i < user.getPosts().size(); i++) {
            if(user.getPosts().get(i).getIdPost().equals(idPost)){
                for (int i1 = 0; i1 < DB.users.size(); i1++) {
                    for (int j = 0; j < DB.users.get(i1).getPosts().size(); j++) {
                        if(DB.users.get(i1).getPosts().get(j).getIdPost().equals(idPost)){
                            DB.users.get(i1).getPosts().remove(i);
                            System.out.println("Successful deleted post by id ✅");
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override
    public void getAllPostByUserId(Long idUser) {
        for (int i = 0; i < DB.users.size(); i++) {
            if(DB.users.get(i).getIdUser().equals(idUser)){
                for (int i1 = 0; i1 < DB.users.get(i).getPosts().size(); i1++) {
                    System.out.println(DB.users.get(i).getPosts().get(i1));
                }
            }
        }
    }
}
