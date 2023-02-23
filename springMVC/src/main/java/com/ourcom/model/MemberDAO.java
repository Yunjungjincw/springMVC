package com.ourcom.model;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
		
		@Autowired
		private SqlSession sqlSession;
		
		
		//회원 전체 리스트 보기
		public List<MemberVO> memberList() {
			//Connection + Statment => sqlSession
			List<MemberVO> list =sqlSession.selectList("memberList");
			return list;
		}
		
		//회원가입 기능
		
		public int memberInsert(MemberVO vo) {
			int cnt =sqlSession.insert("memberInsert",vo);
			return cnt;
		}
		
		//회원가입 기능 (파일 업로드 했을 경우)
		public int memberInsertFile(MemberVO vo) {
			int cnt =sqlSession.insert("memberInsertFile",vo);
			return cnt;
		}
		
		//회원삭제 기능
		public int memberDelete(int num) {
			int cnt =sqlSession.delete("memberDelete",num);
			return cnt;
		}
		
		//회원 상세 보기
		public MemberVO memberContent(int num) {
			MemberVO vo =sqlSession.selectOne("memberContent",num);
			return vo;
		}
		
		//회원 정보 수정
		public int memberUpdate(MemberVO vo) {
			int cnt =sqlSession.update("memberUpdate", vo);
			return cnt;
		}
		
		// login하고 name 가져오기
		public String memberLogin(MemberVO vo) {
			String user_name=sqlSession.selectOne("memberLogin", vo);
			return user_name;
		}
		
		//중복확인
		public String memberDbcheck(String id) {
			String dbId=sqlSession.selectOne("memberDbcheck", id);
			String idDouble ="NO";
			if(dbId!=null) {
				idDouble="YES";
			}
			return idDouble;
		}
		
		
		//회원삭제 기능
		public int memberDeleteFile(int num) {
			int cnt =sqlSession.update("memberDeleteFile",num);
			return cnt;
		}
		
		//
		public int memberUpdateFile(MemberVO vo) {
			int cnt =sqlSession.update("memberUpdateFile",vo);
			return cnt;
		}
		
	}


















