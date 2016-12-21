package com.sample;

public class Sample extends AbstractScreen {

	private static final long serialVersionUID = 1L;
	
	public Sample(final MainApp main) {
		
		super(main);
		this.setTitle("Sample Screen");
		setSize(400, 400);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}
	
}
