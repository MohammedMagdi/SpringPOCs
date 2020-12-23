package com.poc.demo.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poc.demo.data.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

//	@Query("FROM USERS WHERE userName = ?1")
//	UserCustomInf findByUserName(String userName, Sort sort);

//	UserCustomInf findByUserName(String userName);

//	@Query("FROM USERS WHERE firstName = ?1")
//	List<User> findByFirstName(String firstName, Pageable page);

//	@Query("FROM #{#entityName} WHERE firstName = ?1")
//	List<User> findByFirstName(String firstName);

//	@Query(value = "SELECT * FROM #{#entityName} WHERE firstName = ? firstName", nativeQuery = true)
//	List<User> findByFirstName(@Param("firstName") String firstName);

//	UserSummary findByUserName(String userName);
	<T> T findByUserName(String userName, Class<T> type);
}
