package sample;

//import com.sun.org.omg.CORBA.Initializer;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TableView<Student> studentaiTableView;
    @FXML
    private TableColumn<Student,Integer> idTableColumn;
    @FXML
    private TableColumn<Student,String> nameTableColumn;
    @FXML
    private TableColumn<Student,String> surnameTableColumn;
    @FXML
    private TableColumn<Student,String> mailTableColumn;






    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Connection connection = myDb.createConnection();
        if(connection != null){

           //List<Student> studentai= GetStudent(connection);

           idTableColumn.setCellValueFactory(new PropertyValueFactory<Student,Integer>("id"));
           nameTableColumn.setCellValueFactory(new PropertyValueFactory<Student,String>("name"));
           surnameTableColumn.setCellValueFactory(new PropertyValueFactory<Student,String>("surname"));
           mailTableColumn.setCellValueFactory(new PropertyValueFactory<Student,String>("mail"));

           // studentaiTableView.setItems(FXCollections.observableList(studentai));



            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Prisijungeme ");
            alert.show();
        }
    }

   // private List<Student> GetStudent(Connection connection){
      //  List<Student> studListas= new ArrayList<>();

     //   try {
      //      Statement statement = connection.createStatement();
      //      ResultSet resultSet =statement.executeQuery("SELECT * FROM studentai");

     //       while (resultSet.next()){
     //           Student student = new Student(resultSet.getInt("id"),resultSet.getString("name"),
      //                  resultSet.getString("surname"),resultSet.getString("mail"));
      //          studListas.add(student);
       //     }

      //  }catch (SQLException e){
      //      e.printStackTrace();
      //  }



    //    return studListas;
   // }


}