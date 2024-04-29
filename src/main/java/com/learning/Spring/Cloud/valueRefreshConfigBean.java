package com.learning.Spring.Cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class valueRefreshConfigBean {

	private String color;

	public valueRefreshConfigBean(
			@Value ("${application.theme.color}") String color) {
		super();
		this.color = color;
		System.out.println(color);
	}

	public String getColor() {
		return color;
	}
	
	
	
	
}
