package com.jun.creational.blackboard;

public abstract class AbstractKnowledgeSource implements KnowledgeSource{
	protected BlackBoardObject bbo;
	protected BlackBoard bb;
	
	public void run() {
		try {
			updateBlackBoardObject(process(bbo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateBlackBoardObject(BlackBoardObject bbo) {
		bb.addBlackBoardObject(bbo);
	}

}
