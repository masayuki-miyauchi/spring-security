/**
 * 
 */
package org.springframework.security.config;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

/**
 * @author vpuri
 *
 */
public class AuthenticationProcessingFilterNamespaceTests extends TestCase {
	
	public void testAuthenticationFilterBeanDefinition() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
		"org/springframework/security/config/authentication-form-filter.xml");
ConfigurableListableBeanFactory factory = (ConfigurableListableBeanFactory) context
		.getAutowireCapableBeanFactory();
	}

}