package com.example.demo7.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo7.dto.MemberDTO;
@Mapper
public interface MemberMapper {
List<MemberDTO> selectMemberList();
MemberDTO selectMemberDetail(@Param("paramId") String id);
}