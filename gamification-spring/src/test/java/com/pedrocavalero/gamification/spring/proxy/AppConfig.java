package com.pedrocavalero.gamification.spring.proxy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.pedrocavalero.gamification.spring.proxy.GamificationAwareAspect;

@Configuration
@ComponentScan("com.pedrocavalero")
@EnableAspectJAutoProxy
public class AppConfig{
	
//	@Bean
//	public ITestPointAnn getTestPointAnn(){
//		return new TestPointAnnotation();
//	}
//	
//	@Bean
//	public GamificationAwareAspect getGamificationAwareAspect(){
//		return new GamificationAwareAspect();
//	}
}
