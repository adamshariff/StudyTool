package graphics;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Model;

import java.io.IOException;

public class Controller {

    @FXML
    private AnchorPane root;

    private Model model;
    public void initModel(Model model){
        this.model=model;
    }

    public void quiz(ActionEvent actionEvent) throws IOException {

        System.out.println("test");
        Parent root= FXMLLoader.load(getClass().getResource("QuizList.fxml"));
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(new Scene(root));
        window.setMaximized(true);
    }
}
