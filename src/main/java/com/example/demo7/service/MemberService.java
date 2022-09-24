package com.example.demo7.service;

import java.util.List;
import com.example.demo7.dto.MemberDTO;

public interface MemberService {
List<MemberDTO> findMemberList();
MemberDTO findMemberDetail(String id);
void login(String id, String pw);
}