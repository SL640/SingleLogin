package com.login.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.login.domain.user;

@Repository
public interface userRepository extends MongoRepository<user, String> {
//    public user selectUserById(int id);
//    public user selectUserByName(String name);
//    public int insertUser(user user);

}
