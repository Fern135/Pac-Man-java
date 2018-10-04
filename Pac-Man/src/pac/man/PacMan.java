/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pac.man;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Fernandito
 */
public class PacMan extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // setting the physical buttons                 //
        Button up = new Button();//  up                 //
        Button left = new Button();// left              //
        Button down = new Button();// down              //
        Button right = new Button();// right            //
        /************************************************/
        
        // the background                                      //
        Rectangle backGround = new Rectangle(10000, 10000);    //
        /******************************************************/
        
        // setting the text for the physical buttons on the screen  //
        up.setText("^");                                            //          
        left.setText("<");                                          //
        down.setText("V");                                          //
        right.setText(">");                                         //
        /************************************************************/
        
        
        // setting the background color for the background  //
        backGround.setFill(Color.BLACK);                    //
        /****************************************************/
        
        up.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
             });
        
        // initializing what'll be the main window frame
        StackPane root = new StackPane();
        
        root.getChildren().add(backGround);
        // adding materials to the screen
        // root.getChildren().add(up);
        // root.getChildren().add(left);
        root.getChildren().add(down);
        
        
        
        // setting the size of the window, what'll be included and showing it
        Scene scene = new Scene(root, 600, 600);
        
        primaryStage.setTitle("Pac-man Java");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
