//Ivy Guan
//Created on January 2, 2018

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class GameCode extends Application{
	
	public static void main(String[] args)
	{	
		BackEnd.fileCSV();
		Application.launch(args);
	}

	private boolean buttonClicked = false;
	private int numClicks;
	private long startTime;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		primaryStage.setTitle("Fast Clicker"); 
		
		Button button = new Button("Click Me!");
		Label endLabel = new Label("Time is UP!!!");
		HBox hbox = new HBox(button);
		Scene display = new Scene(hbox,200,200); //the format of stage
		button.setMaxSize(80, 30); //sets button size
		hbox.setAlignment(Pos.CENTER); //centers button
		
		button.setOnAction(value ->
		{
			buttonClicked = true;
			if(buttonClicked)
			{
				numClicks++;
				System.out.println(numClicks);
			}
			startTime = System.nanoTime() + 1000000000L;
			new AnimationTimer()
			{

				public void handle(long now)
				{
					if(now > startTime)
					{
						startTime = now + 1000000000L;
						System.out.println(startTime);
					}
				}
			}.start();
		});
		if(startTime > 1000000000L * 10)
		{
			stop(); //stops the timer
			//hbox.getChildren().addAll(endLabel,button);
			
			//place stop and if statement outside(this might be more efficient)
			// also need to convert the nanoseconds to seconds and display the time in hbox
			//after each game need to but high score in the csv file
			
		}
		buttonClicked = false;
		
		
		
		primaryStage.setScene(display); //creates stage using the format
        primaryStage.show(); //displays the stage
        

	}


}
