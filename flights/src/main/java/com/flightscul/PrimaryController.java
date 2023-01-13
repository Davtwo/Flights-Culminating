package com.flightscul;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("primary");
    }
    /*
    *asks user for the arrival and departure location for the plane 
    *
    */
    public void start(Stage stage) {
      //Creating nodes
      TextField textField1 = new TextField("Enter departure location");
      TextField textField2 = new TextField("Enter arrival location");
      //Creating labels
      Label label1 = new Label("Departure Location");
      Label label2 = new Label("Arrival location: ");
      //Adding labels for nodes
      HBox box = new HBox(5);
      box.setPadding(new Insets(25, 5 , 5, 50));
      box.getChildren().addAll(label1, textField1, label2, textField2);
      //Setting the stage
      Scene scene = new Scene(box, 595, 150, Color.BEIGE);
      stage.setTitle("Text Field Example");
      stage.setScene(scene);
      stage.show();
   }
 

}
