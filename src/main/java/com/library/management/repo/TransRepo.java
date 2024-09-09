package com.library.management.repo;

import com.library.management.entity.Transactional;
import org.springframework.data.repository.CrudRepository;

public interface TransRepo extends CrudRepository<Transactional, Integer> {
}
