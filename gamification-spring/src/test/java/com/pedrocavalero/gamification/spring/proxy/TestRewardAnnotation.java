package com.pedrocavalero.gamification.spring.proxy;

import org.springframework.stereotype.Component;

@Component
@GamificationAware
public class TestRewardAnnotation implements ITestRewardAnn {
	
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void doRemoveSomething() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSomething2() {
		// TODO Auto-generated method stub
		
	}

}
