package xfesco.itmanager.dao.mapper;

import xfesco.itmanager.model.InstallmentplanModel;

public interface InstallmentplanModelMapper {
    int deleteByPrimaryKey(Integer installmentserial);

    int insert(InstallmentplanModel record);

    int insertSelective(InstallmentplanModel record);

    InstallmentplanModel selectByPrimaryKey(Integer installmentserial);

    int updateByPrimaryKeySelective(InstallmentplanModel record);

    int updateByPrimaryKey(InstallmentplanModel record);
}