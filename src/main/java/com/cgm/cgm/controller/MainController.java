package com.cgm.cgm.controller;

import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.cgm.cgm.domain.DTO;
import com.cgm.cgm.service.DTOService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/cgm")
public class MainController {
	@Autowired
	private DTOService dtoService;

	@RequestMapping(value="/", method= RequestMethod.GET)
	public String index(
			HttpServletRequest request){
		return "html/index";
	}

	@RequestMapping("/select")
	public List<DTO> getSelectList() {
		List<DTO> dto = dtoService.select();

		return dto;
	}

	@RequestMapping("/insert")
	public void insertDTO(){
		DTO dto = new DTO();
//		dto.setId(100);
		dto.setTitle("new_title");
		dto.setWriter("new_writer");
		dto.setWriteDate(LocalDateTime.now().toString());

		dtoService.insert(dto);
	}
//	// DB 데이터를 불러오는 controller
//	@RequestMapping("/")
//	public String list(Model model) {
//		model.addAttribute("list", mapper.select());
//		return "index";
//	}
//	// DB에 데이터를 저장하는 controller
//	@RequestMapping(value = "request 주소", method = RequestMethod.POST)
//	public String write(DTO dto) {
//		dto.setTitle(dto.getTitle().trim());
//		dto.setHit(dto.getHit());
//		dto.setWriteDate(dto.getWriteDate().trim());
//		dto.setWriter(dto.getWriter().trim());
//		mapper.write(dto);
//		System.out.println(dto);
//		return "redirect:";
//	}

}
