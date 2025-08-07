// import javafx.application.Application;
// import javafx.scene.Scene;
// import javafx.scene.control.*;
// import javafx.scene.layout.VBox;
// import javafx.stage.Stage;

// public class UIControlsExample extends Application {
//     public void start(Stage stage) {
//         Label nameLabel = new Label("Name:");
//         TextField nameField = new TextField();

//         Label genderLabel = new Label("Gender:");
//         ComboBox<String> genderBox = new ComboBox<>();
//         genderBox.getItems().addAll("Male", "Female", "Other");

//         CheckBox agreeBox = new CheckBox("I accept the terms");

//         Button submitButton = new Button("Submit");
//         submitButton.setOnAction(e -> {
//             String name = nameField.getText();
//             String gender = genderBox.getValue();
//             boolean agreed = agreeBox.isSelected();
//             System.out.println("Name: " + name + ", Gender: " + gender + ", Agreed: " + agreed);
//         });

//         VBox layout = new VBox(10, nameLabel, nameField, genderLabel, genderBox, agreeBox, submitButton);
//         layout.setStyle("-fx-padding: 20;");

//         Scene scene = new Scene(layout, 300, 250);
//         stage.setTitle("JavaFX UI Controls Demo");
//         stage.setScene(scene);
//         stage.show();
//     }

//     public static void main(String[] args) {
//         launch(args);
//     }
// }
