package Navigation;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DashboardController {


    public AnchorPane context;

    public void onActionLog(ActionEvent actionEvent) throws IOException {
        setUi("../Navigation/LoginForm");
    }

    public void onActionCreate(ActionEvent actionEvent) throws IOException {
        setUi("../Navigation/SignUpForm");
    }

    private void setUi(String location) throws IOException {
        context.getChildren().clear();
        context.getChildren().add(FXMLLoader.load(
                getClass().getResource(location + ".fxml")));
    }
}
