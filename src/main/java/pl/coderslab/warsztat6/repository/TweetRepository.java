package pl.coderslab.warsztat6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.coderslab.warsztat6.entity.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
	List<Tweet> findByUserUserName(String userName);
	List<Tweet> findByUserId(Long id);
	List<Tweet> findByUserEmail(String email);
}
