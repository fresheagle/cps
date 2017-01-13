package xfesco.itmanager.dao.mapper;

import xfesco.itmanager.model.InstallmentrateModel;

public interface InstallmentrateModelMapper {
    int deleteByPrimaryKey(Integer rateserial);

    int insert(InstallmentrateModel record);

    int insertSelective(InstallmentrateModel record);

    InstallmentrateModel selectByPrimaryKey(Integer rateserial);

    int updateByPrimaryKeySelective(InstallmentrateModel record);

    int updateByPrimaryKey(InstallmentrateModel record);
}