package com.zolix.cropman.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class CropManController {

    @FXML
    private Button openImageBtn;

    @FXML
    private ImageView viewImage;

    @FXML
    private Button saveImage;

    @FXML
    private Label text;

    //File Chooser
    final FileChooser imageChooser=new FileChooser();

    @FXML
    void initialize(){

        openImageBtn.setOnAction(event -> {

            //file opener with .jpg extension filter
            imageChooser.setTitle("Open Image");
            FileChooser.ExtensionFilter exfilterJPG=new FileChooser.ExtensionFilter("JPG files (*.JPG)", "*.JPG");
            imageChooser.getExtensionFilters().addAll(exfilterJPG);

            //show file dialog
            File file=imageChooser.showOpenDialog(new Stage());

            //paste image to imageviewer
            try {
                InputStream inputStream=new FileInputStream(file);
                Image image=new Image(inputStream);
                viewImage.setImage(image);

                //set image dimension while also preserving aspect ratio
                viewImage.setFitHeight(600);
                viewImage.setFitWidth(600);
                viewImage.setPreserveRatio(true);
                viewImage.setSmooth(true);
                viewImage.setCache(true);
            }catch (Exception e){

            }
        });

        //save image event
        saveImage.setOnAction(event -> {
            //file saver with .jpg extension filter
            imageChooser.setTitle("Save Image");
            FileChooser.ExtensionFilter exfilterJPG=new FileChooser.ExtensionFilter("JPG files (*.JPG)", "*.JPG");
            imageChooser.getExtensionFilters().addAll(exfilterJPG);
            File save=imageChooser.showSaveDialog(new Stage());
        });






    }











}