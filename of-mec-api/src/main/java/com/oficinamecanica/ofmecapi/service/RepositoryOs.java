package com.oficinamecanica.ofmecapi.service;

import com.oficinamecanica.ofmecapi.model.Os;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryOs extends JpaRepository<Os, Long> {

}
