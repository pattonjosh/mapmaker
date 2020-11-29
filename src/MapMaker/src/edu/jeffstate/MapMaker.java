package edu.jeffstate;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class MapMaker extends Application{
    public MapMaker() {
        super();
    } //constructor

    public static void main(String[] args) {
        MapMaker mapMaker = new MapMaker();
        launch(args);
    } //main
    
    @Override
    public void start(Stage stage) throws Exception {
            
        try {
            Parent root = FXMLLoader.load(getClass().getResource("MapMakerGUI.fxml"));
                
            var scene = new Scene(root, 630, 400);       
                
            stage.setTitle("MapMaker");
            stage.setScene(scene);
            stage.show();
                
        } catch (Exception ex){
            ex.printStackTrace();
                
        }
            
    } //start
    
    @Override
    public void stop() {
        System.out.println("Exiting via MapMaker stop method");
            
        System.exit(0);
    } //stop
} //MapMaker
