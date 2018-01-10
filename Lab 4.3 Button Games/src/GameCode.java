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
		//long startTime = System.nanoTime();
		BackEnd.fileCSV();
		Application.launch(args);
		//BackEnd.fileCSV();
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
		});
		buttonClicked = false;
		
		startTime = System.nanoTime() + 1000000000L;
		new AnimationTimer()
		{

			public void handle(long now)
			{
				if(now > startTime)
				{
					startTime = now + 1000000000L;
					if(startTime == 1000000000L)
					{
						stop(); //stops the timer
						hbox.getChildren().addAll(endLabel,button);
					}
				}
			}
		}.start();

		primaryStage.setScene(display); //creates stage using the format
        primaryStage.show(); //displays the stage
        

	}


}
