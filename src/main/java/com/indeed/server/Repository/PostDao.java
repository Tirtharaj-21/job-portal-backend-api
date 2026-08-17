package com.indeed.server.Repository;

import com.indeed.server.Entity.PostModel;
import org.springframework.data.jpa.repository.JpaRepository;

//DAO = Data Access Object
public interface PostDao extends JpaRepository<PostModel, Long> {
}
