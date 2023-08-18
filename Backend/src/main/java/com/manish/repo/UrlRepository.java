package com.manish.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.manish.entity.Url;
import java.time.LocalDateTime;
public interface UrlRepository extends JpaRepository<Url, Integer> {

	@Query(value = "select originalurl from Url where shorturl=?1",nativeQuery = true)
	String findByShortUrl(String id);
	void deleteByExpirationTimeBefore(LocalDateTime expirationTime);
}
