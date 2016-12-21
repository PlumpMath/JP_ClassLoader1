package com.sample;

import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;

public class MainApp extends JDialog {
	
	private static final long serialVersionUID = 1L;
	private AbstractScreen main;
	
	// Following could be obtained from a configuration file.
	private String classStr = "com.sample.Sample";
	
	public static void main(final String[] args) {
		EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final MainApp frame = new MainApp();
                    frame.setVisible(false);
                } catch (final Exception e) {
                    e.printStackTrace();
                }
            }
        });
	}
	
	public MainApp() {
		launchMainScreen();
	}
	
	public void launchMainScreen() {

		final ClassLoader classLoader = MainApp.class.getClassLoader();

		try {

			@SuppressWarnings("unchecked")
			final Class<? extends AbstractScreen> screenClass = (Class<? extends AbstractScreen>) classLoader.loadClass(classStr);
			
			try {

				main = screenClass.getConstructor(MainApp.class).newInstance(this);
				main.setVisible(true);

			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
