package com.example.demo7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo7.dto.MemberDTO;
import com.example.demo7.exception.IdNotFoundException;
import com.example.demo7.exception.PwMissMatchException;
import com.example.demo7.mapper.MemberMapper;


@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberMapper memberMapper;

	@Override
	public List<MemberDTO> findMemberList() {
		// TODO Auto-generated method stub
		return memberMapper.selectMemberList();
	}

	@Override
	public MemberDTO findMemberDetail(String id) {
		// TODO Auto-generated method stub
		return memberMapper.selectMemberDetail(id);
	}

	@Override
	public void login(String id, String pw){
		// TODO Auto-generated method stub
		MemberDTO dto=memberMapper.selectMemberDetail(id);
		if(dto==null) throw new IdNotFoundException("존재하지않는ID");
		else
			if(! dto.getPw().equals(pw) ) throw new PwMissMatchException("비밀번호 불일치");
	}
}