package com.flightscul;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class SecondaryController {

    @FXML
    private Text PTFtitle;

    @FXML
    private Button backbutton;

    @FXML
    private Text depdat;

    @FXML
    private Text econTitle;

    @FXML
    private Text genflightTitle;

    @FXML
    private Text locatoloca;

    @FXML
    private TextField opt1;

    @FXML
    private TextField opt2;

    @FXML
    private TextField opt3;

    @FXML
    private TextField opt4;

    @FXML
    private Text repdat;

    @FXML
    void switchToSecondary(ActionEvent event) {

    }
    
    /**
    *Takes the info gathered by data that's in the array
    *displays each prices onto GUI
    *https://stackoverflow.com/questions/34091561/javafx-setting-label-text-from-an-array 
    **/
    /**
    public void start(Stage secondaryStage) throws Exception {
        
    
    label.setText(text[0]);
    label.setTranslateX(200);


    Stage stage = new Stage();
    Pane pane = new Pane();
    Scene scene = new Scene(pane, 800, 500);
    stage.setScene(scene);
    stage.show();

    pane.getChildren().addAll(label);

    }
/**
*
*
**
public void makeLabel() {

    for(int i=0; i<text.length; i++) {

        label.setText(text[i]);

          }

       }
  **/

}


/**

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SecondaryController extends Application { 				

    public static void main(String[] args) {
        launch(args);
    }

 
    public void start(Stage secondaryStage) {
        primaryStage.setTitle("Plane Ticket Price");

        Button button = new Button();
        button.setText("Check Price");
        button.setOnAction(new EventHandler<ActionEvent>() {
          
            public void handle(ActionEvent event) {
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setTitle("Price");

                //example
                                      @Override
                                      public void start(Stage secondaryStage) {
                                          secondaryStage.setTitle("Ticket Price Display");
                                          Button button = new Button();
                                          button.setText("Show Ticket Price");

                                          Label label = new Label();
                                          
                                          button.setOnAction(new EventHandler<ActionEvent>() {
                                              @Override
                                              public void handle(ActionEvent event) {
                                                  try {
                                                      String url = "website url";
                                                      Document doc = Jsoup.connect(url).get();
                                                      Elements price = doc.select("span.ticket-price");
                                                      label.setText(price.text());
                                                  } catch (IOException e) {
                                                      e.printStackTrace();
                                                  }
                                              }
                                          });

                                          StackPane root = new StackPane();
                                          root.getChildren().add(button);
                                          root.getChildren().add(label);
                                          secondaryStage.setScene(new Scene(root, 300, 250));
                                          secondaryStage.show();
                                      }
                                  }
                //add on data later/ url

                VBox layout = new VBox(20);
                layout.getChildren().addAll(label);
                layout.setPadding(new Insets(20, 20, 20, 20));

                Scene scene = new Scene(layout, 300, 250);
                stage.setScene(scene);
                stage.show();
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(button);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}









 */