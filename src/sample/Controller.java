package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.WindowEvent;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Controller {
    //public static void test(){
      //  System.out.println("yes");
    //}

    //@FXML
    //private Button button1;

    @FXML
    private Button button1;
    public void test(ActionEvent actionEvent) throws IOException {
        System.out.println(button1.getHeight());
        button1.prefHeight(100);
        button1.prefHeight(100);
        button1.setPrefSize(100,100);
        System.out.println(button1.getHeight());
        System.out.println("yes");
        /*Parent root= FXMLLoader.load(getClass().getResource("tester.fxml"));
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(new Scene(root, 300,275));*/
    }

    public void test2(){
        button1.prefHeight(100);
        button1.prefHeight(100);
        button1.setPrefSize(100,100);
    }

    public void max(WindowEvent actionEvent){

    }
}
