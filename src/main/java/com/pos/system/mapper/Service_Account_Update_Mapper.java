package com.pos.system.mapper;
import com.pos.system.dto.Service_Account_DTO;
import com.pos.system.dto.Service_Email_DTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface Service_Account_Update_Mapper {

    /**
     * 사용자의 상세정보인 이메일을 수정하는 기능입니다.
     * 사용자가 수정할 이메일을 입력하여 리턴값이 0이면 수정 실패, 1이면 수정 성공
     * @Param Service_Account_DTO
     * @return int
     */
    @Update(" UPDATE SERVICE_ACCOUNT SET SERVICE_EMAIL=#{service_email} WHERE SERVICE_ID=#{service_id} ")
    int modifyEmail(Service_Account_DTO dto);

    /**
     * 사용자의 상세정보인 비밀번호을 수정하는 기능입니다.
     * 사용자가 수정할 비밀번호를 입력하여 리턴값이 0이면 수정 실패, 1이면 수정 성공
     * @Param Service_Account_DTO
     * @return int
     */
    @Update(" UPDATE SERVICE_ACCOUNT SET SERVICE_PW=#{service_pw} WHERE SERVICE_ID=#{service_id} ")
    int modifyPw(Service_Account_DTO dto);


    @Update(" UPDATE AUTH SET AUTHSTATUS='Y' WHERE AUTH_KEY=#{auth_key} AND SERVICE_EMAIL=#{service_email} ")
    int updateAuthStatus(Service_Email_DTO dto);

    @Update(" UPDATE SERVICE_ACCOUNT SET SERVICE_PW=#{service_pw} WHERE SERVICE_EMAIL=#{service_email}; ")
    int pwFind(Service_Account_DTO dto);





}
