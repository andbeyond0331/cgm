package com.cgm.cgm.mapper;

import java.util.List;

import com.cgm.cgm.domain.DTO;

import org.springframework.stereotype.Repository;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface DaoMapper {
	public List<DTO> select();
	public void insert(DTO dto);

	void write(DTO dto);
}
