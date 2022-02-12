package graphics;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Model;

public class Gui extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Model model;
        model= new Model();
        FXMLLoader menuLoader=new FXMLLoader(getClass().getResource("mainmenu.fxml"));
        Parent root= menuLoader.load();
        Controller controller=menuLoader.getController();
        controller.initModel(model);
        stage.setTitle("Study Tool");
        stage.setScene(new Scene(root, 600,400));
        stage.setMaximized(true);
        stage.show();
        System.out.println(stage.getHeight());
        System.out.println(stage.getWidth());
    }
    //public static void main(String[] args){
       // launch(args);
    //}

}
