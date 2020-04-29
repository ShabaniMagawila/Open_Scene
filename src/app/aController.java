// aController.java pia ni java class but not main. Inatumika kucontrol a.fxml and tries to instruct the app 
//Ina muonekano sawa na main but it does not contain the main class
package app;

//Pia ina sehemu ya packages and import, the same as in the main class
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * But the difference is it has own class "aController" which used to implement its function
 * Pia hapa ndio kama framework ya app, kama kufanya control za button, mouse events and others
 * 
 */
public class aController implements Initializable {
    public void ButtonPushed(ActionEvent event) throws IOException {
        Parent home=FXMLLoader.load(getClass().getResource("b.fxml"));
        
        Scene a = new Scene(home);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(a);
        window.show();
    }
    
    
    @FXML
    private AnchorPane parent;
    private double xOffSet=0;
    private double yOffSet=0;
    @FXML
    private Label label;
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
        @FXML
    private void start() {
        parent.setOnMousePressed((event) -> {
        xOffSet=event.getSceneX();
        yOffSet=event.getSceneY();
    });
        parent.setOnMouseDragged((event)-> {
            App.stage.setX(event.getScreenX()-xOffSet);
            App.stage.setY(event.getScreenY()-yOffSet);
            App.stage.setOpacity(0.8f);
        });
        parent.setOnDragDone((event)->{
        App.stage.setOpacity(1.0f);
        });
        
        parent.setOnMouseReleased((event)-> {
          App.stage.setOpacity(1.0f);
        });
    
    }

    @FXML
    private void next(MouseEvent event) {
        
    }
        
}
