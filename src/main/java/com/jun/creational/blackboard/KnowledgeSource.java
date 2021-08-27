package com.jun.creational.blackboard;

public interface KnowledgeSource extends Runnable {

	public boolean canHandle(BlackBoardObject bbo, BlackBoard bb);
	public BlackBoardObject process(BlackBoardObject bbo) throws Exception;
	public void updateBlackBoardObject(BlackBoardObject bbo);
}
