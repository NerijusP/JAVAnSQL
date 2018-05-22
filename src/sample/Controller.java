package sample;

//import com.sun.org.omg.CORBA.Initializer;

import javafx.fxml.Initializable;
import javafx.scene.control.Alert;

import java.net.URL;
import java.sql.Array;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Connection connection = myDb.createConnection();
        if(connection != null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Prisijungeme");
            alert.show();
        }
    }

    private List<Student> GetStudent(Connection connection){
        List<Student> studListas= new ArrayList<>();

        Statement statement = connection.createStatement();


        return studListas;
    }


}