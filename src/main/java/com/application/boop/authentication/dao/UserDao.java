package com.application.boop.authentication.dao;

import com.application.boop.DAO;
import com.application.boop.authentication.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserDao extends DAO<User> {

}
