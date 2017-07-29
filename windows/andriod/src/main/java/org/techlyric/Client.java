package org.techlyric;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.logging.Logger;

public class Client extends Application {
	private static String OS = System.getProperty("os.name").toLowerCase();
	final static Logger LOGGER = Logger.getLogger(Client.class.getName());
	public void start(Stage stage) throws Exception {
	}
	public static void main(String[] args) throws Exception {
		launch(args);
	}
}
