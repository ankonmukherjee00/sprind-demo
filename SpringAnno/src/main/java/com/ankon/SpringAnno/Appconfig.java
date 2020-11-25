/**
 * 
 */
package com.ankon.SpringAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 *
 */
@Configuration
public class Appconfig {
	@Bean
	public samsung getphone() {
		
		return new samsung();
		
	}
	@Bean
	public Mobileprocessor  getprocessor() {
		
	return	new Snapdragon();
		
		
	}

}
