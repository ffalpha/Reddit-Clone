package com.reditclone.repository;
import com.reditclone.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface CommentRepository  extends JpaRepository<Comment,Long>{
}
