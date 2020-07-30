package com.github.sderevianko.blog.repos;

import com.github.sderevianko.blog.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Integer>{
}
