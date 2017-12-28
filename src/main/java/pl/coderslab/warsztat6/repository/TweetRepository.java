package pl.coderslab.warsztat6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pl.coderslab.warsztat6.entity.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
	List<Tweet> findByUserUserName(String userName);
	List<Tweet> findByUserIdOrderByCreatedDesc(Long id);
	List<Tweet> findByUserEmail(String email);
	@Query("SELECT t FROM Tweet t ORDER BY t.created DESC")
	List<Tweet> findAllOrder();
}
