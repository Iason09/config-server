package com.iason.configserver.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by Iason on 2018/8/27.
 */
@Component
@PropertySource(value = "classpath:encryption.properties")
public class DataSourceConfig {

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Value("${username}")
	private String userName;

	@Value("${password}")
	private String passWord;
}
