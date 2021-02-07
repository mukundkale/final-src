package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Notice;



public interface NoticeRepository extends JpaRepository<Notice, Integer> {
	
}
