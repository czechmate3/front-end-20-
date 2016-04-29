/* 
 * The MIT License
 *
 * Copyright 2016 Erich S. Vrany.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author Erich S. Vrany
 * 
 * Comment out anything you don't need
 */
public class FrontEnd20 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
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

        btn.setOnAction((ActionEvent e) -> {
            actiontarget.setText("Sign in button pressed");
        });     // Create EventHandler for when button is pressed
        
        Image sampleImage = new Image("sample.png", 100, 0, false, false);
        ImageView sampleImageView = new ImageView(sampleImage);
        grid.add(sampleImageView, 0, 5);

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
