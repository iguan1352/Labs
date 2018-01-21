//Ivy Guan
//Created on January 2, 2018

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GameCode extends Application{
	
	public static void main(String[] args)
	{	
		BackEnd.fileCSV(numClicks);
		Application.launch(args);
	}

	private static int numClicks;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		primaryStage.setTitle("Fast Clicker"); 
		
		Button button = new Button("Click Me!");
		Text setText = new Text("You have ten seconds to click on the button as fast you can."); 
		Text timer = new Text("Time: 10");
		HBox hbox = new HBox(button);
		Scene display = new Scene(hbox,500,200); //the format of stage
		button.setMaxSize(80, 30); //sets button size
		hbox.setAlignment(Pos.CENTER); //centers button
		
		
		
		button.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				numClicks++;
				
				long gameTime = 10000000000L;
				long timeFrame = System.nanoTime() + gameTime;
				
				new AnimationTimer()
				{

					public void handle(long now)
					{
						if(now > timeFrame)
						{
							Platform.exit();
							System.out.println("Time's UP. You have clicked a total of " + numClicks + " times.");
						}
						else
						{
							timer.setText("Time: " + String.valueOf((timeFrame - now)/1000000000));
							setText.setText("You have clicked " + numClicks + " times so far.");
						}
					}
				}.start();
			}
		});
			
		hbox.getChildren().add(setText);
		hbox.getChildren().add(timer);
		primaryStage.setScene(display); //creates stage using the format
        primaryStage.show(); //displays the stage
        
        
	}

}
