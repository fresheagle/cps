package cn.com.hrbb.cps.dao.mapper;

import java.util.List;

import cn.com.hrbb.cps.model.InstallmentrateModel;

public interface InstallmentrateModelMapper {
    int deleteByPrimaryKey(Integer rateserial);

    int insert(InstallmentrateModel record);

    int insertSelective(InstallmentrateModel record);

    InstallmentrateModel selectByPrimaryKey(Integer rateserial);

    int updateByPrimaryKeySelective(InstallmentrateModel record);

    int updateByPrimaryKey(InstallmentrateModel record);
    
    public List<InstallmentrateModel> GetInstallmentRate(String InstallmentPlanCode);
}