import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginController {

    public Button submitButton;
    public Text errorMessage;
    public TextField usernameTextField;
    public Button createGameButton;
    public Button joinGameButton;



    public void onClickCreate(ActionEvent actionEvent) {
    }

    public void onClickJoin(ActionEvent actionEvent) {
    }



    public void onClickSubmit(ActionEvent actionEvent) {

        try{
            Stage chessboard = new Stage();
            Parent loader = FXMLLoader.load(getClass().getResource("sample/Chessboard.fxml"));
            chessboard.setResizable(false);
            chessboard.setTitle("Chess");
            chessboard.setScene(new Scene(loader, 670, 670));
            chessboard.show();
        }catch(Exception ex){
            ex.printStackTrace();
        }


    }
}
