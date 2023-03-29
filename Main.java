import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	private int money = 0; // Initializing money to 0

	private Label moneyLabel = new Label("Current $$$: " + money); // Creating a label for displaying money
	private Label multiplierLabel = new Label(); // Creating a label for displaying multiplier gained by upgradeOne
	private Label numberOfClickersLabel = new Label(); // Creating a label for displaying how many clickers there are
	private Label speedOfClickersLabel = new Label(); // Creating a label for displaying how fast the clickers are

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setResizable(false); // Making it so that the user cannot re-size the application window

		Pane p = new Pane(); // Creates pane

		Button moneyButton = new Button("Click for money!"); // Creating main button
		// Setting button size and location
		moneyButton.setPrefWidth(225);
		moneyButton.setPrefHeight(350);
		moneyButton.setTranslateX(25);
		moneyButton.setTranslateY(55);

		upgradeOneClass one = new upgradeOneClass(0); // Creating the upgradeOne object
		Button upgradeOne = new Button(one.getName());
		multiplierLabel.setText("Multiplier: " + one.getMultiplier() + "x"); // Creating/ updating the label
		// Setting button size and location
		upgradeOne.setPrefWidth(175);
		upgradeOne.setPrefHeight(100);
		upgradeOne.setTranslateX(275);
		upgradeOne.setTranslateY(55);

		UpgradeTwoClass two = new UpgradeTwoClass(); // Creating the UpgradeTwo object
		numberOfClickersLabel.setText("Number of clickers: " + two.getNumberOfClickers()); // Creates Label
		Button upgradeTwo = new Button(two.getName());
		// Setting button size and location
		upgradeTwo.setPrefWidth(175);
		upgradeTwo.setPrefHeight(100);
		upgradeTwo.setTranslateX(275);
		upgradeTwo.setTranslateY(180);

		UpgradeThreeClass three = new UpgradeThreeClass(); // Creating the UpgradeThree object
		Button upgradeThree = new Button(three.getName());
		speedOfClickersLabel.setText("Speed of Clickers: " + three.getSeconds() + "s");
		// Setting button size and location
		upgradeThree.setPrefWidth(175);
		upgradeThree.setPrefHeight(100);
		upgradeThree.setTranslateX(275);
		upgradeThree.setTranslateY(305);

		Group upgradeButtons = new Group(upgradeOne, upgradeTwo, upgradeThree); // Group of the upgrade button
		Group bigButton = new Group(moneyButton); // Big button group (separated to make it make more sense in my head)

		moneyButton.setOnAction(e -> { // Event handler for when the moneyButton (main button) being clicked the
			money = money + one.getMultiplier(); // Increments money
			moneyLabel.setText("Current $$$: " + money); // Updates the label to display current money
		});

		upgradeOne.setOnAction(e -> { // Event handler for when the top upgrade button is being clicked
			if (money >= one.getCost()) { // Making sure the user has enough money to get the upgrade
				money = money - one.getCost(); // Updating the current user money
				moneyLabel.setText("Current $$$: " + money); // Updates the label to display current money
				int level = one.getLevel(); // getting the current upgrade level
				level++; // Incrementing the upgrade to the next level
				one.updateLevel(level); // Applying the new upgrade level
				multiplierLabel.setText("Multiplier: " + one.getMultiplier() + "x"); // Creating/ updating the label to
																						// display the multiplier
				upgradeOne.setText(one.getName()); // Renaming the button after upgrade
				if (one.getExists() == false) { // Checking to see if the button should still exist
					upgradeOne.setVisible(false); // making the button disappear
				}
			}
		});

		upgradeTwo.setOnAction(e -> { // Event handler for when the middle upgrade button is being clicked
			if (money >= two.getCost()) { // Making sure the user has enough money to get the upgrade
				money = money - two.getCost(); // Updating the current user money
				moneyLabel.setText("Current $$$: " + money); // Updates the label to display current money
				int level = two.getLevel(); // getting the current upgrade level
				level++; // Incrementing the upgrade to the next level
				two.updateLevel(level); // Applying the new upgrade level
				numberOfClickersLabel.setText("Number of clickers: " + two.getNumberOfClickers());
				upgradeTwo.setText(two.getName()); // Renaming the button after upgrade
				// Creating a keyframe object for a loop
				KeyFrame keyFrame = new KeyFrame(Duration.seconds(three.getSeconds()), event -> { // Keyframe loop
					// runs every ___ amount of seconds as determined by the UpgradeTwoClass
					money = money + one.getMultiplier(); // Updates the money
					moneyLabel.setText("Current $$$: " + money); // Displays the money
				});

				// Creating a timeline for the loop to repeat forever, then starting it
				Timeline timeline = new Timeline(keyFrame);
				timeline.setCycleCount(Animation.INDEFINITE);
				timeline.play();

				if (two.getExists() == false) { // Checking to see if the button should still exist
					upgradeTwo.setVisible(false); // making the button disappear
				}
			}
		});

		upgradeThree.setOnAction(e -> {
			if (money >= three.getCost()) { // Making sure the user has enough money to get the upgrade
				money = money - three.getCost(); // Updating the current user money
				moneyLabel.setText("Current $$$: " + money); // Updates the label to display current money
				int level = three.getLevel(); // getting the current upgrade level
				level++; // Incrementing the upgrade to the next level
				three.updateLevel(level); // Applying the new upgrade level
				speedOfClickersLabel.setText("Speed of any new clickers: " + three.getSeconds() + "s");
				upgradeThree.setText(three.getName()); // Renaming the button after upgrade

				if (three.getExists() == false) { // Checking to see if the button should still exist
					upgradeThree.setVisible(false); // making the button disappear
				}

			}
		});

		// Sets location for moneyLabel
		moneyLabel.setTranslateX(25);
		moneyLabel.setTranslateY(10);

		// Sets location for multiplierLabel
		multiplierLabel.setTranslateX(25);
		multiplierLabel.setTranslateY(30);

		// Sets location for numberOfClickersLabel
		numberOfClickersLabel.setTranslateX(110);
		numberOfClickersLabel.setTranslateY(30);

		// Sets location for speedOfClickersLabel
		speedOfClickersLabel.setTranslateX(238);
		speedOfClickersLabel.setTranslateY(30);

		// Adds everything to the pane
		p.getChildren().addAll(bigButton, moneyLabel, upgradeButtons, multiplierLabel, numberOfClickersLabel,
				speedOfClickersLabel);

		Scene s = new Scene(p, 475, 420); // Creates the scene

		// Making everything pop up in the window
		primaryStage.setScene(s);
		primaryStage.show();

	}

}
