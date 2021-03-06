package com.pedrocavalero.gamification.spring.proxy;

import org.esfinge.gamification.annotation.RankingsToUser;
import org.esfinge.gamification.annotation.RemoveRankings;

public interface ITestRankingAnn {
	
	@RankingsToUser(name = "Noob", level = "level 1")
    public void doSomething();
	
	@RemoveRankings(name = "Noob", level ="level 1")
	public void doRemoveSomething();
	

}
