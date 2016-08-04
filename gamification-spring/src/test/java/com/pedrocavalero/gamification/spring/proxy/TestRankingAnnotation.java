package com.pedrocavalero.gamification.spring.proxy;

import org.springframework.stereotype.Component;

@Component
@GamificationAware
public class TestRankingAnnotation implements ITestRankingAnn {

	@Override
	public void doSomething() {
	}

	@Override
	public void doRemoveSomething() {
	}


}
