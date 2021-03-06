/**
 * 
 */
package com.mr.security.core.validate.code;

import com.mr.security.core.properties.SecurityProperties;
import com.mr.security.core.validate.code.image.ImageCodeGenerator;
import com.mr.security.core.validate.code.sms.SmsCodeSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mr.security.core.properties.SecurityProperties;
import com.mr.security.core.validate.code.image.ImageCodeGenerator;
import com.mr.security.core.validate.code.sms.DefaultSmsCodeSender;
import com.mr.security.core.validate.code.sms.SmsCodeSender;

/**
 * @author zhailiang
 *
 */
@Configuration
public class ValidateCodeBeanConfig {
	
	@Autowired
	private SecurityProperties securityProperties;
	
	@Bean
	@ConditionalOnMissingBean(name = "imageValidateCodeGenerator")
	public ValidateCodeGenerator imageValidateCodeGenerator() {
		ImageCodeGenerator codeGenerator = new ImageCodeGenerator();
		codeGenerator.setSecurityProperties(securityProperties);
		return codeGenerator;
	}
	
	@Bean
	@ConditionalOnMissingBean(SmsCodeSender.class)
	public SmsCodeSender smsCodeSender() {
		return new DefaultSmsCodeSender();
	}

}
