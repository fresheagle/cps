package cn.com.hrbb.cps.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.com.hrbb.cps.app.service.InstallmentrateService;
import cn.com.hrbb.cps.dao.mapper.InstallmentrateModelMapper;
import cn.com.hrbb.cps.model.InstallmentrateModel;

public class InstallmentrateServiceImpl implements InstallmentrateService{

	@Autowired
	InstallmentrateModelMapper InstallmentrateModelMap;
	
	@Override
	public List<InstallmentrateModel> GetInstallmentRate(String InstallmentPlanCode) {
		// TODO Auto-generated method stub
		List<InstallmentrateModel> installmentRate = new ArrayList<InstallmentrateModel>();
		
		installmentRate = InstallmentrateModelMap.GetInstallmentRate(InstallmentPlanCode);
		return installmentRate;
	}

}
