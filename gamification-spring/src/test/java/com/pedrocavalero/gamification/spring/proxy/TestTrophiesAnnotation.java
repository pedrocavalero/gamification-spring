package com.pedrocavalero.gamification.spring.proxy;

import org.springframework.stereotype.Component;

@Component
@GamificationAware
public class TestTrophiesAnnotation implements ITestTrophiesAnn {
	
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void doSomething2() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void doRemoveSomething() {
		// TODO Auto-generated method stub

	}

}
