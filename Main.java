import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	private boolean evolve = false; // Setup for ninja evolution

	private int money = 0; // Initializing money to 0

	private Label moneyLabel = new Label("Current $$$: " + money); // Creating a label for displaying money

	@Override
	public void start(Stage primaryStage) throws Exception {

		ImageView smoke0 = new ImageView("Smoke.png"); // Getting the smoke picture
		smoke0.setFitHeight(125); // Setting Size
		smoke0.setPreserveRatio(true); // Locking the ratio
		smoke0.setTranslateX(55); // Setting X position
		smoke0.setTranslateY(50); // Setting Y poition
		smoke0.setVisible(false); // Making the smoke invisible

		ImageView smoke = new ImageView("Smoke.png"); // Getting the smoke picture
		smoke.setFitHeight(125); // Setting Size
		smoke.setPreserveRatio(true); // Locking the ratio
		smoke.setTranslateX(10); // Setting X position
		smoke.setTranslateY(70); // Setting Y poition
		smoke.setVisible(false); // Making the smoke invisible

		ImageView smoke1 = new ImageView("Smoke.png"); // Getting the smoke picture
		smoke1.setFitHeight(125); // Setting Size
		smoke1.setPreserveRatio(true); // Locking the ratio
		smoke1.setTranslateX(112); // Setting X position
		smoke1.setTranslateY(55); // Setting Y poition
		smoke1.setVisible(false); // Making the smoke invisible

		ImageView smoke2 = new ImageView("Smoke.png"); // Getting the smoke picture
		smoke2.setFitHeight(125); // Setting Size
		smoke2.setPreserveRatio(true); // Locking the ratio
		smoke2.setTranslateX(20); // Setting X position
		smoke2.setTranslateY(120); // Setting Y poition
		smoke2.setVisible(false); // Making the smoke invisible

		ImageView smoke3 = new ImageView("Smoke.png"); // Getting the smoke picture
		smoke3.setFitHeight(125); // Setting Size
		smoke3.setPreserveRatio(true); // Locking the ratio
		smoke3.setTranslateX(100); // Setting X position
		smoke3.setTranslateY(135); // Setting Y poition
		smoke3.setVisible(false); // Making the smoke invisible

		ImageView smoke4 = new ImageView("Smoke.png"); // Getting the smoke picture
		smoke4.setFitHeight(125); // Setting Size
		smoke4.setPreserveRatio(true); // Locking the ratio
		smoke4.setTranslateX(40); // Setting X position
		smoke4.setTranslateY(210); // Setting Y poition
		smoke4.setVisible(false); // Making the smoke invisible

		ImageView smoke5 = new ImageView("Smoke.png"); // Getting the smoke picture
		smoke5.setFitHeight(125); // Setting Size
		smoke5.setPreserveRatio(true); // Locking the ratio
		smoke5.setTranslateX(100); // Setting X position
		smoke5.setTranslateY(220); // Setting Y poition
		smoke5.setVisible(false); // Making the smoke invisible

		ImageView smoke6 = new ImageView("Smoke.png"); // Getting the smoke picture
		smoke6.setFitHeight(125); // Setting Size
		smoke6.setPreserveRatio(true); // Locking the ratio
		smoke6.setTranslateX(55); // Setting X position
		smoke6.setTranslateY(280); // Setting Y poition
		smoke6.setVisible(false); // Making the smoke invisible

		ImageView log = new ImageView("Log.png"); // Getting the first log picture
		log.setFitHeight(50); // Setting Size
		log.setPreserveRatio(true); // Locking the ratio

		ImageView log2 = new ImageView("Log.png"); // Getting the second log picture
		log2.setFitHeight(50); // Setting Size
		log2.setPreserveRatio(true); // Locking the ratio

		ImageView log3 = new ImageView("Log.png"); // Getting the third log picture
		log3.setFitHeight(50); // Setting Size
		log3.setPreserveRatio(true); // Locking the ratio

		ImageView ninjaStanding2 = new ImageView("ninja-image2-1.png"); // Getting the second standing Ninja image
		ninjaStanding2.setFitHeight(350); // Setting Size
		ninjaStanding2.setPreserveRatio(true); // Locking the ratio
		ninjaStanding2.setVisible(false); // Making the ninja invisible

		ImageView ninjaKicking2 = new ImageView("ninja-image2-2.png"); // Getting the second kicking Ninja image
		ninjaKicking2.setFitHeight(350); // Setting Size
		ninjaKicking2.setPreserveRatio(true); // Locking the ratio
		ninjaKicking2.setVisible(false); // Making the ninja invisible

		ImageView ninjaStanding = new ImageView("ninja-image.png"); // Getting the standing Ninja image
		ninjaStanding.setFitHeight(350); // Setting Size
		ninjaStanding.setPreserveRatio(true); // Locking the ratio

		ImageView ninjaKicking = new ImageView("ninja-image2.png"); // Getting the kicking Ninja image
		ninjaKicking.setFitHeight(350); // Setting Size
		ninjaKicking.setPreserveRatio(true); // Locking the ratio

		primaryStage.setResizable(false); // Making it so that the user cannot re-size the application window

		Pane p = new Pane(); // Creates pane

		// Basic button for evolution of ninja demonstration
		Button transform = new Button("Click to transform!");
		transform.setTranslateX(150);
		transform.setTranslateY(15);

		Button moneyButton = new Button(); // Creating main button
		moneyButton.setGraphic(ninjaStanding); // Setting the picture for the button
		// Making the button transparent
		moneyButton.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
		// Setting button size and location
		moneyButton.setPrefWidth(225);
		moneyButton.setPrefHeight(350);
		moneyButton.setTranslateX(5);
		moneyButton.setTranslateY(55);

		Rectangle rectangle = new Rectangle(250, 75); // Creating the backround for the button
		rectangle.setFill(Color.rgb(200, 150, 100)); // Setting fill color for rectagle
		rectangle.setStroke(Color.rgb(100, 50, 0)); // Setting the stroke color
		rectangle.setStrokeWidth(3); // Setting stroke width
		// Setting rectangle location
		rectangle.setTranslateX(275);
		rectangle.setTranslateY(55);

		Button upgradeOne = new Button(); // Making the top right button
		upgradeOne.setGraphic(log); // Setting the picture for the button
		// Making the button transparent
		upgradeOne.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
		// Setting button size and location
		upgradeOne.setPrefWidth(175);
		upgradeOne.setPrefHeight(75);
		upgradeOne.setTranslateX(275);
		upgradeOne.setTranslateY(55);

		Rectangle rectangle2 = new Rectangle(250, 75); // Creating the backround for the button
		rectangle2.setFill(Color.rgb(200, 150, 100)); // Setting fill color for rectagle
		rectangle2.setStroke(Color.rgb(100, 50, 0)); // Setting the stroke color
		rectangle2.setStrokeWidth(3); // Setting stroke width
		// Setting rectangle location
		rectangle2.setTranslateX(275);
		rectangle2.setTranslateY(180);

		Button upgradeTwo = new Button(); // Making the middle right button
		upgradeTwo.setGraphic(log2); // Setting the picture for the button
		// Making the button transparent
		upgradeTwo.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
		// Setting button size and location
		upgradeTwo.setPrefWidth(175);
		upgradeTwo.setPrefHeight(75);
		upgradeTwo.setTranslateX(275);
		upgradeTwo.setTranslateY(180);

		Rectangle rectangle3 = new Rectangle(250, 75); // Creating the backround for the button
		rectangle3.setFill(Color.rgb(200, 150, 100)); // Setting fill color for rectagle
		rectangle3.setStroke(Color.rgb(100, 50, 0)); // Setting the stroke color
		rectangle3.setStrokeWidth(3); // Setting stroke width
		// Setting rectangle location
		rectangle3.setTranslateX(275);
		rectangle3.setTranslateY(305);

		Button upgradeThree = new Button(); // Making the bottom right button
		upgradeThree.setGraphic(log3); // Setting the picture for the button
		// Making the button transparent
		upgradeThree.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
		// Setting button size and location
		upgradeThree.setPrefWidth(175);
		upgradeThree.setPrefHeight(75);
		upgradeThree.setTranslateX(275);
		upgradeThree.setTranslateY(305);

		Group upgradeButtons = new Group(upgradeOne, upgradeTwo, upgradeThree); // Group of the upgrade button
		Group bigButton = new Group(moneyButton); // Big button group (separated to make it make more sense in my head)

		moneyButton.setOnAction(e -> { // Event handler for when the moneyButton (main button) being clicked the
			money++; // Increments money
			moneyLabel.setText("Current $$$: " + money); // Updates the label to display current money

			if (evolve == false) { // If ninja did not evolve
				moneyButton.setGraphic(ninjaKicking); // Change button to ninjaKicking
				PauseTransition delay = new PauseTransition(Duration.seconds(0.1)); // Create a delay for the animation
				// Change button back to ninjaStanding
				delay.setOnFinished(event -> moneyButton.setGraphic(ninjaStanding));
				delay.play(); // Start the animation
			} else if (evolve == true) { // If ninja did evolve
				moneyButton.setGraphic(ninjaKicking2); // Change button to ninjaKicking2
				PauseTransition delay = new PauseTransition(Duration.seconds(0.1)); // Create a delay for the animation
				// Change button back to ninjaStanding2
				delay.setOnFinished(event -> moneyButton.setGraphic(ninjaStanding2));
				delay.play(); // Start the animation
			}
		});

		upgradeOne.setOnAction(e -> { // Event handler for when the top upgrade button is being clicked

		});

		upgradeTwo.setOnAction(e -> { // Event handler for when the middle upgrade button is being clicked

		});

		upgradeThree.setOnAction(e -> { // Event handler for when the bottom upgrade button is being clicked

		});

		transform.setOnAction(e -> { // Makes the smoke appear, changes ninja, then smoke dissapears
			PauseTransition delay0 = new PauseTransition(Duration.seconds(.5)); // Create a delay for the animation
			delay0.setOnFinished(event -> smoke0.setVisible(true)); // Change smoke to visible
			delay0.play(); // Start the animation

			PauseTransition delay = new PauseTransition(Duration.seconds(1)); // Create a delay for the animation
			delay.setOnFinished(event -> smoke1.setVisible(true)); // Change smoke to visible
			delay.play(); // Start the animation

			PauseTransition delay1 = new PauseTransition(Duration.seconds(1.5)); // Create a delay for the animation
			delay1.setOnFinished(event -> smoke.setVisible(true)); // Change smoke to visible
			delay1.play(); // Start the animation

			PauseTransition delay2 = new PauseTransition(Duration.seconds(2)); // Create a delay for the animation
			delay2.setOnFinished(event -> smoke2.setVisible(true)); // Change smoke to visible
			delay2.play(); // Start the animation

			PauseTransition delay3 = new PauseTransition(Duration.seconds(2.5)); // Create a delay for the animation
			delay3.setOnFinished(event -> smoke3.setVisible(true)); // Change smoke to visible
			delay3.play(); // Start the animation

			PauseTransition delay4 = new PauseTransition(Duration.seconds(3)); // Create a delay for the animation
			delay4.setOnFinished(event -> smoke4.setVisible(true)); // Change smoke to visible
			delay4.play(); // Start the animation

			PauseTransition delay5 = new PauseTransition(Duration.seconds(3.5)); // Create a delay for the animation
			delay5.setOnFinished(event -> smoke5.setVisible(true)); // Change smoke to visible
			delay5.play(); // Start the animation

			PauseTransition delay6 = new PauseTransition(Duration.seconds(4)); // Create a delay for the animation
			delay6.setOnFinished(event -> smoke6.setVisible(true)); // Change smoke to visible
			delay6.play(); // Start the animation

			PauseTransition delay15 = new PauseTransition(Duration.seconds(4.5)); // Create a delay for the animation
			delay15.setOnFinished(event -> {

				evolve = true; // changing the evolution boolean to true
				ninjaStanding2.setVisible(true); // Making the ninjaStanding2 graphic visible
				ninjaKicking2.setVisible(true); // Making the ninjaKicking2 graphic visible
				// Change button to ninjaKicking2 (The graphics wont work without this line)
				moneyButton.setGraphic(ninjaKicking2);
				moneyButton.setGraphic(ninjaStanding2); // Changing the button to ninjaStanding2

			});
			delay15.play(); // Start the animation

			PauseTransition delay7 = new PauseTransition(Duration.seconds(4.5)); // Create a delay for the animation
			delay7.setOnFinished(event -> smoke0.setVisible(false)); // Change smoke to invisible
			delay7.play(); // Start the animation

			PauseTransition delay8 = new PauseTransition(Duration.seconds(5)); // Create a delay for the animation
			delay8.setOnFinished(event -> smoke1.setVisible(false)); // Change smoke to invisible
			delay8.play(); // Start the animation

			PauseTransition delay9 = new PauseTransition(Duration.seconds(5.5)); // Create a delay for the animation
			delay9.setOnFinished(event -> smoke.setVisible(false)); // Change smoke to invisible
			delay9.play(); // Start the animation

			PauseTransition delay10 = new PauseTransition(Duration.seconds(6)); // Create a delay for the animation
			delay10.setOnFinished(event -> smoke2.setVisible(false)); // Change smoke to invisible
			delay10.play(); // Start the animation

			PauseTransition delay11 = new PauseTransition(Duration.seconds(6.5)); // Create a delay for the animation
			delay11.setOnFinished(event -> smoke3.setVisible(false)); // Change smoke to invisible
			delay11.play(); // Start the animation

			PauseTransition delay12 = new PauseTransition(Duration.seconds(7)); // Create a delay for the animation
			delay12.setOnFinished(event -> smoke4.setVisible(false)); // Change smoke to invisible
			delay12.play(); // Start the animation

			PauseTransition delay13 = new PauseTransition(Duration.seconds(7.5)); // Create a delay for the animation
			delay13.setOnFinished(event -> smoke5.setVisible(false)); // Change smoke to invisible
			delay13.play(); // Start the animation

			PauseTransition delay14 = new PauseTransition(Duration.seconds(8)); // Create a delay for the animation
			delay14.setOnFinished(event -> smoke6.setVisible(false)); // Change smoke to invisible
			delay14.play(); // Start the animation

		});

		Rectangle rectangle4 = new Rectangle(115, 25); // Creating the backround for the button
		rectangle4.setFill(Color.rgb(200, 150, 100)); // Setting fill color for rectagle
		rectangle4.setStroke(Color.rgb(100, 50, 0)); // Setting the stroke color
		rectangle4.setStrokeWidth(5); // Setting stroke width
		// Setting rectangle location
		rectangle4.setTranslateX(2);
		rectangle4.setTranslateY(3);

		// Sets location for moneyLabel
		moneyLabel.setTranslateX(8);
		moneyLabel.setTranslateY(6.75);

		// Adds everything to the pane
		p.getChildren().addAll(bigButton, moneyLabel, upgradeButtons, rectangle, rectangle2, rectangle3, rectangle4,
				transform, smoke0, smoke, smoke1, smoke2, smoke3, smoke4, smoke5, smoke6, ninjaStanding2,
				ninjaKicking2);

		// Making the rectangles go behind the buttons
		rectangle.toBack();
		rectangle2.toBack();
		rectangle3.toBack();
		rectangle4.toBack();

		// Setting the backround image
		p.setStyle("-fx-background-image: url('backround.jpg'); -fx-background-size: cover;");

		Scene s = new Scene(p, 550, 420); // Creates the scene

		// Making everything pop up in the window
		primaryStage.setScene(s);
		primaryStage.show();

	}

}
