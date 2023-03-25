package com.cgm.cgm.service;

import java.util.List;

import com.cgm.cgm.domain.DTO;

public interface DTOService {
	List<DTO> select();
	void insert(DTO dto);
}
