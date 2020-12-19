package com.poc.demo.data.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poc.demo.data.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	@Query("FROM USERS WHERE userName = ?1")
	List<User> findByUserName(String userName, Sort sort);

//	@Query("FROM USERS WHERE firstName = ?1")
//	List<User> findByFirstName(String firstName, Pageable page);

//	@Query("FROM #{#entityName} WHERE firstName = ?1")
//	List<User> findByFirstName(String firstName);

//	@Query(value = "SELECT * FROM #{#entityName} WHERE firstName = ? firstName", nativeQuery = true)
//	List<User> findByFirstName(@Param("firstName") String firstName);

	<T> T findByUserName(String userName, Class<T> type);
}
