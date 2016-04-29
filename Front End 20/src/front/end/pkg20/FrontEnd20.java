/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front.end.pkg20;

import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Erich S. Vrany
 */
public class FrontEnd20 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        /*Button btn = new Button(); // Step one of the tutorial from Oracle
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();*/
        
        primaryStage.setTitle("JavaFX Welcome");
        
        GridPane grid = new GridPane(); // Create grid
        grid.setAlignment(Pos.CENTER); // Set alignmet
        grid.setHgap(10); // Set gap between horizontal sections
        grid.setVgap(10); // Set gap between verticle sections
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Text scenetitle = new Text("Welcome");
        scenetitle.setId("welcome-text");
        grid.add(scenetitle, 0, 0, 2, 1); // Create and add a screentitle at 
                                          // 0,0 spanning 2 columns and 1 row
        
        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1); // Create and add a label at 0,1                                         

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1); // Create and add a TextField at 1,1
        
        Label pw = new Label("Password:");
        grid.add(pw, 0, 2); // Create and add a label at 0,2
        
        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2); // Create and add a PasswordField at 1,2
        
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4); // Create and add a button at 1,4
        
        final Text actiontarget = new Text(); // Create CSS actiontarget
        grid.add(actiontarget, 1, 6);
        actiontarget.setId("actiontarget"); // Add an actiontarget at 0,1

        btn.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setText("Sign in button pressed");
            }
        });     // Create EventHandler for when button is pressed

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        
        scene.getStylesheets().add
        (FrontEnd20.class.getResource("StyleSheet.css").toExternalForm());
                // Add CSS
        
        primaryStage.show(); // Create UI
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
