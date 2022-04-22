package com.dj.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dj.springcloud.model.Coupan;

public interface CoupanRepo extends JpaRepository<Coupan, Long> {

}
