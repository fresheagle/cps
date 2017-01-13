package cn.com.hrbb.cps.dao.mapper;

import java.util.List;

import cn.com.hrbb.cps.model.TradelogModel;

public interface TradelogModelMapper {
    int deleteByPrimaryKey(Integer logid);

    int insert(TradelogModel record);

    int insertSelective(TradelogModel record);

    TradelogModel selectByPrimaryKey(Integer logid);

    int updateByPrimaryKeySelective(TradelogModel record);

    int updateByPrimaryKey(TradelogModel record);
    
    public List<TradelogModel> GetInstallmentRate(String InstallmentPlanCode);
    
    public void InsertLog(TradelogModel Request);
}