package com.pedrocavalero.gamification.spring.proxy;

import org.esfinge.gamification.annotation.Named;
import org.springframework.stereotype.Component;

@Component
@GamificationAware
public class TestPointAnnotation implements ITestPointAnn{
	
	public void doSomething(){
	}
	
	public void doWrong(){
		throw new RuntimeException();
	}
	
	public void doRemoveSomething(){
	}

	public void niceComment(String comment, @Named("owner") String owner) {
	}

	public void niceComment(@Named("comment") Comment c) {
	}

	public void doRemoveWrong() {
		throw new RuntimeException();
	}

}


