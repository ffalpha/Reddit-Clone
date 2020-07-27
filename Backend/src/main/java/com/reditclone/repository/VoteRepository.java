package com.reditclone.repository;

import com.reditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface VoteRepository extends JpaRepository<Vote,Long> {
}
