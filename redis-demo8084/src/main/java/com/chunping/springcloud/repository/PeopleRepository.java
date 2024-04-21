package com.chunping.springcloud.repository;

import com.chunping.springcloud.domain.Person;
import com.redis.om.spring.repository.RedisDocumentRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends RedisDocumentRepository<Person,String>, CrudRepository<Person,String> {
}
