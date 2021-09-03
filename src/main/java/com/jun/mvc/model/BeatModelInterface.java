package com.jun.mvc.model;

public interface BeatModelInterface {
	void initialise();
	void on();
	void off();
	void setBPM(int bpm);
	int getBPM();
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);
}
