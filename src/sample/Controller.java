package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class Controller {

    public void printbuttonclicked(){
        System.out.println("Knopf gedrückt, Herzlichen Glühstrumpf!");
    }

   //* public void changesceneLetsGo(ActionEvent event) throws IOException{

   //     Parent newsceneParent = FXMLLoader.load(getClass().getResource("newscene.fxml"));
     //   Scene newsceneScene = new Scene(newsceneParent);
       // Stage newscene = (Stage) ((Node)event.getSource()).getScene().getWindow();

    //    newscene.setScene(newsceneScene);
      //  newscene.show();
    //}

    public void letsGoChange(ActionEvent actionEvent) throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("newscene.fxml"));
        Scene newsceneScene = new Scene(root);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(newsceneScene);
        window.show();

    }

    public void press_rules ( ActionEvent actionEvent ) throws IOException {
        Parent newParent = FXMLLoader.load(getClass().getResource("newscene.fxml"));
        Scene newScene = new Scene(newParent);

        Stage fenster = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        fenster.setScene(newScene);
        fenster.show();
    }
}

