package com.fm.elema.boot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 全局配置属性
 * 
 * 
 */
@Component
@ConfigurationProperties()
public class GlobalConfig {
	
	private String appName;

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	 
	 

}
