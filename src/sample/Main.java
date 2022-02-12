package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Controller t= new Controller();
       /* primaryStage.addEventHandler(WindowEvent.ANY, new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                System.out.println(event.getEventType());
            }
        });*/
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));

        primaryStage.show();
        //t.test2();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
