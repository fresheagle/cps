package cn.com.hrbb.cps.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import cn.com.hrbb.cps.app.service.InstallmentplanService;
import cn.com.hrbb.cps.dao.mapper.InstallmentplanModelMapper;
import cn.com.hrbb.cps.model.InstallmentplanModel;

public class InstallmentplanServiceImpl implements InstallmentplanService{

	@Autowired
	InstallmentplanModelMapper InstallmentplanModelMap;
	
	@Override
	public List<InstallmentplanModel> GetInstallmentPlanCode(Map<String, String> map) {
		// TODO Auto-generated method stub
		List<InstallmentplanModel> installmentPlan = new ArrayList<InstallmentplanModel>();
		
		installmentPlan = InstallmentplanModelMap.GetInstallmentPlanCode(map);
		return installmentPlan;
	}

}
