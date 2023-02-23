package com.ourcom.narp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.ourcom.model.MemberDAO;
import com.ourcom.model.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberDAO dao;
	
	@RequestMapping("/memberList.do")
	public String memberList(Model model) {
		List<MemberVO> list = dao.memberList();
		System.out.println(list);
		model.addAttribute("list",list);
		return "memberList";
	}
	
	@RequestMapping("/memberInsert.do")
	public String memberInsert(MemberVO vo) {
		//파라메터 수집(VO)
		// 인코딩
		int cnt=dao.memberInsert(vo);
		
		
		return "redirect:/memberList.do";
	}
	
	@RequestMapping("/memberRegister.do")
	public String memberRegister() {
		
		
		return "memberRegister";
	}
	
	
	public String memberDelete(@RequestParam("num") int num) {
		int cnt=dao.memberDelete(num);
		
		return "redirect:/memberList.do";
	}
	
	
	
	
	@RequestMapping("/productList.do")
	public String productList() {
		
		return "productList";
	}
	
	@RequestMapping("/memberAjaxList.do")
	public @ResponseBody List<MemberVO> memberAjaxList() {
		List<MemberVO> list = dao.memberList();
		// $.ajax() -> callback 함수로 응답
		
		
		return list;
	}
	
	@RequestMapping("/form.do")
	public String form() {
		return "uploadForm";
	}
	
	
}
