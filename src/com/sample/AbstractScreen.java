package com.sample;

import javax.swing.JFrame;

public class AbstractScreen extends JFrame{

	private static final long serialVersionUID = 1L;
	
	 @SuppressWarnings("unused")
	private final MainApp main;
	
	protected AbstractScreen(MainApp main) {
		this.main = main;
	}
	
	public AbstractScreen getMain() {
        return this;
    }
	
	public void update() {
        // must be overridden to do anything.
    }

    public void ProgramExiting() {
    }

}
