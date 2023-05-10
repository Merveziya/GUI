import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class GUI extends Application{
 
  public void start(Stage firstStage){
    Button first = new Button("Click!");
    Button second = new Button("Click!");
    Button last = new Button("Click!");
    BorderPane layout = new BorderPane(); 
    layout.setTop(first);
    layout.setRight(second);
    layout.setLeft(last);
    
    Scene scene = new Scene(layout);
    firstStage.setScene(scene);  
    firstStage.show();
    
  }
  
  public static void main(String[] args){
    Application.launch(args);
  }
  
}