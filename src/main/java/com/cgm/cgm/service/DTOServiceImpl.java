package com.cgm.cgm.service;

import java.util.List;

import com.cgm.cgm.domain.DTO;
import com.cgm.cgm.mapper.DaoMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DTOServiceImpl implements DTOService {
	@Autowired
	private DaoMapper mapper;

	@Override
	public List<DTO> select() {
		return mapper.select();
	}

	@Override
	public void insert(DTO dto) {
		mapper.insert(dto);
	}
}
