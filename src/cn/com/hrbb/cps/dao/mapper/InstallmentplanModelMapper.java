package cn.com.hrbb.cps.dao.mapper;

import java.util.List;
import java.util.Map;

import cn.com.hrbb.cps.model.InstallmentplanModel;

public interface InstallmentplanModelMapper {
    int deleteByPrimaryKey(Integer installmentserial);

    int insert(InstallmentplanModel record);

    int insertSelective(InstallmentplanModel record);

    InstallmentplanModel selectByPrimaryKey(Integer installmentserial);

    int updateByPrimaryKeySelective(InstallmentplanModel record);

    int updateByPrimaryKey(InstallmentplanModel record);
    
    public List<InstallmentplanModel> GetInstallmentPlanCode(Map<String, String> map);
}