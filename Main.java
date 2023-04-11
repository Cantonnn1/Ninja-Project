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

//		// Setting up the backround music
//		String path = "music.mp3";
//		Media media = new Media(Paths.get(path).toUri().toString());
//		MediaPlayer mediaPlayer = new MediaPlayer(media);
//		mediaPlayer.play();

		ImageView smoke0 = new ImageView("Smoke.png"); // Getting the smoke picture
		smokeConfiguration(smoke0, 55, 50);

		ImageView smoke = new ImageView("Smoke.png"); // Getting the smoke picture
		smokeConfiguration(smoke, 10, 70);

		ImageView smoke1 = new ImageView("Smoke.png"); // Getting the smoke picture
		smokeConfiguration(smoke1, 112, 55);

		ImageView smoke2 = new ImageView("Smoke.png"); // Getting the smoke picture
		smokeConfiguration(smoke2, 20, 120);

		ImageView smoke3 = new ImageView("Smoke.png"); // Getting the smoke picture
		smokeConfiguration(smoke3, 100, 135);

		ImageView smoke4 = new ImageView("Smoke.png"); // Getting the smoke picture
		smokeConfiguration(smoke4, 40, 210);

		ImageView smoke5 = new ImageView("Smoke.png"); // Getting the smoke picture
		smokeConfiguration(smoke5, 100, 220);

		ImageView smoke6 = new ImageView("Smoke.png"); // Getting the smoke picture
		smokeConfiguration(smoke6, 55, 280);

		ImageView log = new ImageView("Log.png"); // Getting the first log picture
		logConfiguration(log);

		ImageView log2 = new ImageView("Log.png"); // Getting the second log picture
		logConfiguration(log2);

		ImageView log3 = new ImageView("Log.png"); // Getting the third log picture
		logConfiguration(log3);

		ImageView ninjaStanding2 = new ImageView("ninja-image2-1.png"); // Getting the second standing Ninja image
		ninjaConfiguration(ninjaStanding2);
		ninjaStanding2.setVisible(false); // Making the ninja invisible

		ImageView ninjaKicking2 = new ImageView("ninja-image2-2.png"); // Getting the second kicking Ninja image
		ninjaConfiguration(ninjaKicking2);
		ninjaKicking2.setVisible(false); // Making the ninja invisible

		ImageView ninjaStanding = new ImageView("ninja-image.png"); // Getting the standing Ninja image
		ninjaConfiguration(ninjaStanding);

		ImageView ninjaKicking = new ImageView("ninja-image2.png"); // Getting the kicking Ninja image
		ninjaConfiguration(ninjaKicking);

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
		rectangleConfiguration(rectangle, 275, 55);

		Button upgradeOne = new Button(); // Making the top right button
		upgradeButtonConfiguration(upgradeOne, log, 275, 55);

		Rectangle rectangle2 = new Rectangle(250, 75); // Creating the backround for the button
		rectangleConfiguration(rectangle2, 275, 180);

		Button upgradeTwo = new Button(); // Making the middle right button
		upgradeButtonConfiguration(upgradeTwo, log2, 275, 180);

		Rectangle rectangle3 = new Rectangle(250, 75); // Creating the backround for the button
		rectangleConfiguration(rectangle3, 275, 305);

		Button upgradeThree = new Button(); // Making the bottom right button
		upgradeButtonConfiguration(upgradeThree, log3, 275, 305);

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

			transform(smoke0, .2);
			transform(smoke, .4);
			transform(smoke1, .6);
			transform(smoke2, .8);
			transform(smoke3, 1);
			transform(smoke4, 1.2);
			transform(smoke5, 1.4);
			transform(smoke6, 1.6);
			transform(smoke0, 1.8);
			transform(smoke1, 2);
			transform(smoke, 2.2);
			transform(smoke2, 2.4);
			transform(smoke3, 2.6);
			transform(smoke4, 2.8);
			transform(smoke5, 3);
			transform(smoke6, 3.2);

			PauseTransition delay = new PauseTransition(Duration.seconds(1.8)); // Create a delay for the animation
			delay.setOnFinished(event -> {

				evolve = true; // changing the evolution boolean to true
				ninjaStanding2.setVisible(true); // Making the ninjaStanding2 graphic visible
				ninjaKicking2.setVisible(true); // Making the ninjaKicking2 graphic visible
				// Change button to ninjaKicking2 (The graphics wont work without this line)
				moneyButton.setGraphic(ninjaKicking2);
				moneyButton.setGraphic(ninjaStanding2); // Changing the button to ninjaStanding2

			});
			delay.play(); // Start the animation

		});

		Rectangle rectangle4 = new Rectangle(115, 25); // Creating the backround for the moneyLabel
		rectangleConfiguration(rectangle4, 2, 3);
		rectangle4.setStrokeWidth(5); // Setting stroke width

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

	private void transform(ImageView smoke, double time) {
		PauseTransition delay = new PauseTransition(Duration.seconds(time)); // Create a delay for the animation
		if (time < 1.7) { // making sure smoke appears and dissapears at the correct time
			delay.setOnFinished(event -> smoke.setVisible(true)); // Change smoke to visible
		} else {
			delay.setOnFinished(event -> smoke.setVisible(false)); // Change smoke to invisible
		}
		delay.play(); // Start the animation
	}

	private void upgradeButtonConfiguration(Button upgrade, ImageView log, int x, int y) {
		upgrade.setGraphic(log); // Setting the picture for the button
		// Making the button transparent
		upgrade.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
		// Setting button size and location
		upgrade.setPrefWidth(175);
		upgrade.setPrefHeight(75);
		upgrade.setTranslateX(x);
		upgrade.setTranslateY(y);
	}

	private void rectangleConfiguration(Rectangle rectangle, int x, int y) {
		rectangle.setFill(Color.rgb(200, 150, 100)); // Setting fill color for rectagle
		rectangle.setStroke(Color.rgb(100, 50, 0)); // Setting the stroke color
		rectangle.setStrokeWidth(3); // Setting stroke width
		// Setting rectangle location
		rectangle.setTranslateX(x);
		rectangle.setTranslateY(y);
	}

	private void logConfiguration(ImageView log) {
		log.setFitHeight(50); // Setting Size
		log.setPreserveRatio(true); // Locking the ratio
	}

	private void smokeConfiguration(ImageView smoke, int x, int y) {
		smoke.setFitHeight(125); // Setting Size
		smoke.setPreserveRatio(true); // Locking the ratio
		smoke.setVisible(false); // Making the smoke invisible
		smoke.setTranslateX(x); // Setting X position
		smoke.setTranslateY(y); // Setting Y poition
	}

	public static void ninjaConfiguration(ImageView ninja) {
		ninja.setFitHeight(350); // Setting Size
		ninja.setPreserveRatio(true); // Locking the ratio
	}

}
