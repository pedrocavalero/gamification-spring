package com.pedrocavalero.gamification.spring.proxy;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.esfinge.gamification.proxy.GameInvoker;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class GamificationAwareAspect {

	@Pointcut("execution(public * *(..))")
    public void anyPublicMethod() {
    }

	
	@Around("anyPublicMethod() && @target(gamificationAn) ")// && args(parameters,..) 
    public Object logAction(
        ProceedingJoinPoint pjp, GamificationAware gamificationAn )//, Object[] parameters
        throws Throwable {
		Object result = pjp.proceed();
		MethodSignature signature = (MethodSignature) pjp.getSignature();
		Method method = signature.getMethod();
		Object[] args = pjp.getArgs();
		GameInvoker gameInvoker = GameInvoker.getInstance();
		gameInvoker.registerAchievment(pjp.getTarget(), method, args);
		return result;
    }
}
