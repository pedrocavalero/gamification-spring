package com.pedrocavalero.gamification.spring.proxy;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.pedrocavalero.gamification")
@EnableAspectJAutoProxy
public class AppConfig{
}
