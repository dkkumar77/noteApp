import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {

    @FXML
    private JFXTextField username;

    @FXML
    private JFXTextField password;

    @FXML
    private JFXButton submit, newDoc;



    @FXML
    void newDocCreation(ActionEvent event){


        if(event.getSource().equals(newDoc)){


        }




    }

    @FXML
    public void handleSubmit(ActionEvent event){

        if(event.getSource().equals(submit)){

            username.setText("");
            password.setText("");

        }




    }





}
