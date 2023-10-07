package com.zolix.cropman.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class CropManController {

    @FXML
    private Button openImageBtn;

    @FXML
    private ImageView viewImage;

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
            File file=imageChooser.showOpenDialog(new Stage());
        });






    }











}