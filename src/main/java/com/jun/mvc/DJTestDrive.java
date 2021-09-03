package com.jun.mvc;

import com.jun.mvc.controller.BeatController;
import com.jun.mvc.controller.ControllerInterface;
import com.jun.mvc.model.BeatModel;
import com.jun.mvc.model.BeatModelInterface;

public class DJTestDrive {
	public static void main(String[] args) {
		BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
	}
}
