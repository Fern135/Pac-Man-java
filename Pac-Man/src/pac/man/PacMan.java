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
        
        // creating pacman                  //
        Circle pacMan = new Circle();       // 
        /************************************/

        // the background                                     //
        Rectangle backGround = new Rectangle(10000, 10000);   //
        /******************************************************/
        
        // setting the text for the buttons on the screen   //
        up.setText("^");                                    //          
        left.setText("<");                                  //
        down.setText("V");                                  //
        right.setText(">");                                 //
        /****************************************************/
        
        // the position of the down button on the screen    // 
        down.setTranslateX(300);// left and right pos       //
        down.setTranslateY(335);// up and down pos          //
        /****************************************************/
        
        // the position of the right button on the screen   // 
        right.setTranslateX(325);// left and right pos      //
        right.setTranslateY(335);// up and down pos         //
        /****************************************************/
        
        // the position of the left button on the screen    // 
        left.setTranslateX(273);// left and right pos       //
        left.setTranslateY(335);// up and down pos          //
        /****************************************************/
        
        // the position of the up button on the screen      //
        up.setTranslateX(300);// left and right pos         //
        up.setTranslateY(308);// up and down pos            //
        /****************************************************/


        // setting the initial location for pacman
        pacMan.setTranslateX(300);
        pacMan.setTranslateY(300);

        
        // setting the background color for the background  //
        backGround.setFill(Color.BLACK);                    //
        /****************************************************/
        
        
        // Event driven to move pacman usign the keyboard
        up.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
             });
        /***************************************************/
        
        
        // initializing what'll be the main window frame    //
        StackPane root = new StackPane();                   //
        /****************************************************/
        
        // adding the objects to the stackpane. aka main window
        root.getChildren().add(backGround);//<------- the background color
        root.getChildren().add(pacMan);//<----------- adding pacman to the main window
        root.getChildren().add(up);//<--------------- the up button
        root.getChildren().add(left);//<------------- the left button
        root.getChildren().add(down);//<------------- the down button
        root.getChildren().add(right);//<------------ the uright button
        
        
        
        // setting the size of the window, what'll be included and showing it
        Scene scene = new Scene(root, 700, 700);
        
        primaryStage.setTitle("Pac-man Java");// Title
        primaryStage.setResizable(false);// not being able to resize the screen 
        primaryStage.setScene(scene);// putting it all together
        primaryStage.show();// showing the window
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
