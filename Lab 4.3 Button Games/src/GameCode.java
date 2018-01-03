//Ivy Guan
//Created on January 2, 2018



import java.beans.EventHandler;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class GameCode extends Application{
	
	public static void main(String[] args)
	{	
		//long startTime = System.nanoTime();
		Application.launch(args);
		//long 
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		primaryStage.setTitle("Fast Clicker"); 
		
		Button button = new Button("Click Me!");
		HBox hbox = new HBox(button);
		Scene display = new Scene(hbox,200,200); //the format of stage
		button.setMaxSize(80, 30); //sets button size
		//button.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		button.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent event)
			{
				if(//if mouse is clicked add one to score)
				{
					
				}
			}
		});

		primaryStage.setScene(display); //creates stage using the format
        primaryStage.show(); //displays the stage
        

	}


}
