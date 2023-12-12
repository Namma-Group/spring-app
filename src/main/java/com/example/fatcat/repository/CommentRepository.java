package com.example.fatcat.repository;

import com.example.fatcat.model.Comment;
import com.example.fatcat.model.Post;
import com.example.fatcat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
