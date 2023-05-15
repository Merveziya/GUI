import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javax.swing.JFrame;

public class ScreenGUI extends Application {
   private Button firstButton;
     public void start(Stage primaryStage) {
    
      firstButton = new Button("Click for the new screen.");
      BorderPane pane = new BorderPane();
      pane.setTop(firstButton);
    
  
     firstButton.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent e) {
      Stage stage = new Stage();
      stage.setScene(new Scene(new BorderPane(), 500, 500));
      firstButton.setText("New Screen is opened! ");
      stage.show();
      }
      });

      Scene scene = new Scene(pane);
      primaryStage.setScene(scene);
      primaryStage.show();
     }
   
     public static void main(String[] args) {
     Application.launch(args);
     }
}
