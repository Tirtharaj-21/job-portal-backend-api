package com.indeed.server.dao;

import com.indeed.server.model.PostModel;
import org.springframework.data.jpa.repository.JpaRepository;

//DAO = Data Access Object
public interface PostDao extends JpaRepository<PostModel, Long> {
}
