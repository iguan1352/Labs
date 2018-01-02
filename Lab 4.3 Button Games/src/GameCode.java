//Ivy Guan
//Created on January 2, 2018


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class GameCode extends Application{
	
	public static void main(String[] args)
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		primaryStage.setTitle("Fast Clicker"); 
		
		Button button = new Button("Click Me!");
		Scene display = new Scene(button, 100, 100); //the format of stage
		primaryStage.setScene(display); //sets the format of stage
        primaryStage.show(); //displays the stage
        
        button.setStyle("-fx-font-size: 2");
	}


}
