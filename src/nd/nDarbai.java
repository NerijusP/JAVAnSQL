package nd;

import sample.Student;
import sample.TotExistMom;
import sample.TotUseMom;

import java.sql.*;
import java.util.*;


public class nDarbai {

    private static final String URL="jdbc:mysql://localhost:3306/tekla_stats";
    private static final String Name="root";
    private static final String Pass="";
    Connection Sujungimas = createConnection();


    public static void main(String[] args) {

        List<TotExistMom> momentaiList = new ArrayList<>();
        List<TotUseMom> momentaiUsedList = new ArrayList<>();
        nDarbai ndarbai= new nDarbai();
//        ndarbai.AddOneMoment();
//        ndarbai.AddOneUsedMoment();

        for (TotExistMom totmomentas : momentaiList =ndarbai.GetTotExistMoment()){
            System.out.println(totmomentas.getLogID()+" "+totmomentas.getTotalLicExist()+" "+totmomentas.getAll_cm()+" "+totmomentas.getAll_dfr()+" "+
                    totmomentas.getAll_fud()+" "+totmomentas.getAll_pcd()+" "+totmomentas.getAll_vie());
        }
        System.out.println("--------------------");
        for (TotUseMom totusemomentas : momentaiUsedList =ndarbai.GetTotUseMoment()){
            System.out.println(totusemomentas.getLogID()+" "+totusemomentas.getTotalLicExist()+" "+totusemomentas.getUsed_cm()+" "+totusemomentas.getUsed_dfr()+" "+
                    totusemomentas.getUsed_fud()+" "+totusemomentas.getUsed_pcd()+" "+totusemomentas.getUsed_vie());


        }


    }

    public static Connection createConnection(){
        Connection connection=null;

        try {
            connection = DriverManager.getConnection(URL,Name,Pass);

        }catch (SQLException e){
            System.out.println(""+e);
        }


        return connection;
    }

//    public List<Student> GetStudent(){
//        List<Student> studListas= new ArrayList<>();
//
//        try {
//            Statement statement = Sujungimas.createStatement();
//           ResultSet resultSet =statement.executeQuery("SELECT * FROM studentai");
//
//           while (resultSet.next()){
//                Student student = new Student(resultSet.getInt("id"),resultSet.getString("name"),
//                        resultSet.getString("surname"),resultSet.getString("mail"));
//               studListas.add(student);
//            }
//
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//
//        return studListas;
//    }
//    public List<Student> WriteOneStudent(){
//        List<Student> irasomasVienListas= new ArrayList<>();
//
//
//        try {
//            Statement statement = Sujungimas.createStatement();
//            //ResultSet resultSet =statement.executeQuery("SELECT * FROM studentai");
//            statement.execute("INSERT INTO studentai (name,surname,mail) VALUE('Rokas','Zilinskas','tv3@gmail.com')");
//
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//
//        return irasomasVienListas;
//    }

    public List<TotExistMom> AddOneMoment(){
        List<TotExistMom> irasomVienaMomListas= new ArrayList<>();

        try {
            Statement statement = Sujungimas.createStatement();
            //ResultSet resultSet =statement.executeQuery("SELECT * FROM studentai");
            statement.execute("INSERT INTO total_exist (totalLicExist,all_dfr,all_cm,all_fud,all_pcd,all_vie) " +
                    "VALUE('2018-05-01 10:00:04.0','13','3','4','44','25')");

        }catch (SQLException e){
            e.printStackTrace();
        }



        return irasomVienaMomListas;
    }

    public List<TotUseMom> AddOneUsedMoment(){
        List<TotUseMom> irasomVienaUsedMomenta=new ArrayList<>();

        try {
            Statement statement = Sujungimas.createStatement();
            //ResultSet resultSet =statement.executeQuery("SELECT * FROM studentai");
            statement.execute("INSERT INTO total_use (totalLicExist,used_dfr,used_cm,used_fud,used_pcd,used_vie) " +
                    "VALUE('2018-05-01 10:00:04.0','3','13','4','44','25')");

        }catch (SQLException e){
            e.printStackTrace();
        }



        return irasomVienaUsedMomenta;
    }

    public List<TotExistMom> GetTotExistMoment(){
        List<TotExistMom> momentListas = new ArrayList<>();




        try {
            Statement statement = Sujungimas.createStatement();
            ResultSet resultSet =statement.executeQuery("SELECT * FROM total_exist");

            while (resultSet.next()){

                TotExistMom existMomentas = new TotExistMom(resultSet.getInt("logID"),
                        resultSet.getTimestamp("totalLicExist"),
                        resultSet.getInt("all_dfr"),resultSet.getInt("all_cm"),
                        resultSet.getInt("all_fud"),
                        resultSet.getInt("all_pcd"),resultSet.getInt("all_vie"));
                momentListas.add(existMomentas);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }





        return momentListas;
    }

    public List<TotUseMom> GetTotUseMoment(){
        List<TotUseMom> momentListas= new ArrayList<>();


        try {
            Statement statement = Sujungimas.createStatement();
            ResultSet resultSet =statement.executeQuery("SELECT * FROM total_use");

            while (resultSet.next()){

                TotUseMom useMomentas=new TotUseMom(resultSet.getInt("logID"),resultSet.getTimestamp("totalLicExist"),
                       resultSet.getInt("used_dfr"),resultSet.getInt("used_cm"),resultSet.getInt("used_fud"),
                     resultSet.getInt("used_pcd"),resultSet.getInt("used_vie"));
                momentListas.add(useMomentas);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return momentListas;
    }




}
