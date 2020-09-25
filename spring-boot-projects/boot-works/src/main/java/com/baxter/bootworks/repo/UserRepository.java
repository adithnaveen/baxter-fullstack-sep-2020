package com.baxter.bootworks.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.baxter.bootworks.beans.User;

// ALL crud Operations are done
@Repository
public interface UserRepository extends MongoRepository<User, Integer> {

}
