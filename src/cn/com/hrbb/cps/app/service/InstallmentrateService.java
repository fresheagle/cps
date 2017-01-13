package cn.com.hrbb.cps.app.service;

import java.util.List;

import cn.com.hrbb.cps.model.InstallmentrateModel;

public interface InstallmentrateService {
	List<InstallmentrateModel> GetInstallmentRate(String InstallmentPlanCode);
}
