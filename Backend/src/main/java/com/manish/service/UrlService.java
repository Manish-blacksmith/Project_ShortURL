package com.manish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static  com.manish.logic.GenerateShortUrl.isUrlValid;

import java.time.LocalDateTime;

import static  com.manish.logic.GenerateShortUrl.getShortUrl;

import com.manish.entity.Url;
import com.manish.repo.UrlRepository;
@Service
public class UrlService {
@Autowired
UrlRepository urlRepository;
	public String getOriginalUrl(String id) {
		
		return urlRepository.findByShortUrl(id);
	}
	public Url generateShortUrl(String url) {
	if(! isUrlValid(url)) {
		System.out.println("url is not valid");
		return null;
	}
	Url urlObject=new Url();
	urlObject.setOriginalurl(url);
	urlObject.setShorturl(getShortUrl(url));
	urlObject.setExpirationTime(LocalDateTime.now().plusMinutes(5));
	return urlRepository.save(urlObject);
	}

}
