package com.jun.creational.blackboard;

import java.util.List;
import java.util.Observer;
import java.util.concurrent.ExecutorService;


public interface BlackBoardController extends Observer{
	public void setKnowledgeSourceList(List<KnowledgeSource> ksList);
	public void enrollKnowledgeSource(KnowledgeSource ks, ExecutorService exsvc);
	public void execOutcome(BlackBoardObject bbo);
}
