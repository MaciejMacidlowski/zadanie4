package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Arrays;


public class Main extends Application {
    final int APP_SIZE = 800;
    final Gracz[] gracze = new Gracz[4];
    int liczbaWprowadzona;
    int rzuty=0;
   

    @Override
    public void start(Stage primaryStage) throws Exception{

      enterPlayersLayout();

    }


    public void enterPlayersLayout() {
        GridPane root = new GridPane();
        Stage stage = new Stage();
        Scene scene = new Scene(root,APP_SIZE/4+200,APP_SIZE/4);
        stage.setScene(scene);
        scene.getRoot().requestFocus();
        root.setAlignment(Pos.CENTER);
        stage.setTitle("Wprowadź liczbę graczy");
        TextField textFieldNumberOfPlayers = new TextField();
        textFieldNumberOfPlayers.setPromptText("Wprowadź liczbę graczy");
        Button enterPlayers = new Button("OK");
        root.add(textFieldNumberOfPlayers,0,0);
        root.add(enterPlayers,0,1);

        enterPlayers.setOnAction(event -> {
            if (doesntContainLetter(textFieldNumberOfPlayers.getText()) && Integer.parseInt(textFieldNumberOfPlayers.getText())<=4 && Integer.parseInt(textFieldNumberOfPlayers.getText())>0){
                liczbaWprowadzona = Integer.parseInt(textFieldNumberOfPlayers.getText());
                gameLayout();
                stage.close();

            }
            else alert();
        });


        stage.show();
    }
    public void gameLayout() {
        GridPane root = new GridPane();
        Stage stage = new Stage();
        Scene scene = new Scene(root,APP_SIZE,APP_SIZE);
        stage.setScene(scene);
        root.setAlignment(Pos.CENTER);
        root.requestFocus();
        stage.setTitle("Tablica wyników do gry w kręgle - symulacja");

        for (int i = 0; i < liczbaWprowadzona; i++) {
            Gracz gracz = new Gracz(i);
            gracze[i] = gracz;
        }








            Text text_ile_zbite = new Text("Dodaj punkty gracza");
            root.add(text_ile_zbite,0,0);
            Button dodajPunkty = new Button("+ Punkty gracza ");
            root.add(dodajPunkty,0,2);
            TextField ile_zbite = new TextField();
            root.add(ile_zbite,0,1);


//            dodajPunkty.setOnAction(event -> {
//
//
//                if (doesntContainLetter(ile_zbite.getText())){
//
//                Rzut rzut = new Rzut(Integer.parseInt(ile_zbite.getText()));
//                System.out.println(rzut);
//
//
//            }
//                int rzutkula = 0;
//                for (int runda = 0; runda <= 10; runda++) {
//
//
//                    for (int gracz = 0; gracz < liczbaWprowadzona; gracz++) {
//
//
//
//
//
//
//                            do {
//                                if (doesntContainLetter(text_ile_zbite.getText())){
//                                    Rzut rzut = new Rzut(Integer.parseInt(text_ile_zbite.getText()));
//                                    gracze[gracz].addRzut(rzut);
//                                    System.out.println("elo");
//                                }
//                                else alert();
//                            }
//                            while (rzutkula==2);
//
//
//
//
//
//                    }
//
//                }
//
//            });






                        
                    












        stage.show();




    }



    public static  void alert(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Ostrzeżenie");
        alert.setContentText("Proszę wprowadzić prawidłową liczbę");
        alert.showAndWait();
    }

    public static  void alertStrike(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Strike");
        alert.setContentText("Strike!");
        alert.showAndWait();
    }
    public static boolean doesntContainLetter(String text){
        if (text.isEmpty()){
            return false;
        }
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i)) || text.contains(",") == true){
                return false;
            }
        }
        return true;
    }

    public static void addRzut (Gracz gracz,TextField textField){
      if (doesntContainLetter(textField.getText())){
          Rzut rzut = new Rzut(Integer.parseInt(textField.getText()));

      }
    }

    public static void runda(Gracz gracz,TextField textField,Gracz[] gracze,int liczbaWprowadzona,int count){

    }


    public static void main(String[] args) {
        launch(args);
    }

}
