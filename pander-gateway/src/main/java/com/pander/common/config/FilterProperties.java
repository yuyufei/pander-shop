package com.pander.common.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "pander.filter")
public class FilterProperties {

	private List<String> allowPaths;

	public List<String> getAllowPaths() {
		return allowPaths;
	}

	public void setAllowPaths(List<String> allowPaths) {
		this.allowPaths = allowPaths;
	}

}
