/**Sehemu ya kwanza na hii ndio inaitwa main class
 * App hii imetengenezwa na Shabani Magawila kama ya kujifunzia
 * Kwenye App kuna vitu vitatu vya kuangalia yaani app.java, a.fxml, na aController.java
 * app.java ndio main class, 
 * then a.fxml ndio User Interface yetu ambayo inaonyesha muonekano, lakini inakuwa controlled  by aController.java
 */

//hii ni package ambayo inajumuisha App.java, a.fxml na aController.java
package app;

//Hii ni sehemu ambyo inatumika kuimport some libraries ambazo zinatakiwa zitumike kwenye app yetu
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/** Hii ni sehemu inayotumika kufanya connection kati ya app.java and a.fxml
 * Code zote zinazomuhusu a.fxml should be written here
 * */
public class App extends Application {
    private double xOffset = 0;
    private double yOffset = 0;
    public static Stage stage = null;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("a.fxml"));
        Scene scene = new Scene(root, Color.GREEN);
        this.stage =stage; 
        stage.initStyle(StageStyle.UNDECORATED);
       
    
        stage.setScene(scene);
        stage.show();
    }

   //Code zote zinazomuhusu main class should be written here:
    public static void main(String[] args) {
        launch(args);
    }
    
}
