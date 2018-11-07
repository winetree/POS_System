package com.pos.system.mapper;
import com.pos.system.dto.Store_Category_DTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Store_Category_Read_Mapper {
    //전체 메뉴 조회
   @Select(" SELECT MENU_SEQ,STORE_SEQ, MENU_NAME, CATEG_NAME, MENU_INFO,ORIGIN_FNAME, STORED_FNAME, MENU_PRICE, DELFLAG FROM STORE_CATEGORY ")
   List<Store_Category_DTO> selectAll();

    //카테고리별 메뉴의 목록을 조회
    @Select(" SELECT MENU_SEQ,STORE_SEQ, MENU_NAME, CATEG_NAME, MENU_INFO,ORIGIN_FNAME, STORED_FNAME, MENU_PRICE, DELFLAG FROM STORE_CATEGORY WHERE CATEG_NAME=#{categ_name} ")
    public List<Store_Category_DTO> categSelect(String categ_name);

    //메뉴 상세정보 조회
    @Select(" SELECT MENU_SEQ,STORE_SEQ, MENU_NAME, CATEG_NAME, MENU_INFO,ORIGIN_FNAME, STORED_FNAME, MENU_PRICE, DELFLAG FROM STORE_CATEGORY WHERE MENU_NAME=#{menu_name} ")
    public Store_Category_DTO selectOne(String menu_name);
}
