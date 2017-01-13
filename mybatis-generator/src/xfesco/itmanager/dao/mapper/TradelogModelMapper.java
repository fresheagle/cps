package xfesco.itmanager.dao.mapper;

import xfesco.itmanager.model.TradelogModel;

public interface TradelogModelMapper {
    int deleteByPrimaryKey(Integer logid);

    int insert(TradelogModel record);

    int insertSelective(TradelogModel record);

    TradelogModel selectByPrimaryKey(Integer logid);

    int updateByPrimaryKeySelective(TradelogModel record);

    int updateByPrimaryKey(TradelogModel record);
}