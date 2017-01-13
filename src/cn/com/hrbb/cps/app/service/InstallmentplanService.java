package cn.com.hrbb.cps.app.service;

import java.util.List;
import java.util.Map;

import cn.com.hrbb.cps.model.InstallmentplanModel;

public interface InstallmentplanService {
	List<InstallmentplanModel> GetInstallmentPlanCode(Map<String, String> map);
}
