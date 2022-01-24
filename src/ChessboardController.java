import com.sun.deploy.util.StringUtils;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class ChessboardController {

    public GridPane gridPane;
    public Rectangle r5c0;
    public ImageView pawnWhite1;
    public ImageView pawnBlack1;
    public ImageView pawnBlack2;
    public ImageView pawnBlack3;
    public ImageView pawnBlack4;
    public ImageView pawnBlack5;
    public ImageView pawnBlack6;
    public ImageView pawnBlack7;
    public ImageView pawnBlack8;
    public ImageView rookBlack1;
    public ImageView rookBlack2;
    public ImageView knightBlack1;
    public ImageView knightBlack2;
    public ImageView bishopBlack1;
    public ImageView bishopBlack2;
    public ImageView queenBlack;
    public ImageView kingBlack;
    public ImageView pawnWhite2;
    public ImageView pawnWhite7;
    public ImageView pawnWhite5;
    public ImageView pawnWhite4;
    public ImageView pawnWhite3;
    public ImageView pawnWhite6;
    public ImageView pawnWhite8;
    public ImageView rookWhite1;
    public ImageView rookWhite2;
    public ImageView knightWhite1;
    public ImageView knightWhite2;
    public ImageView bishopWhite1;
    public ImageView bishopWhite2;
    public ImageView queenWhite;
    public ImageView kingWhite;
    public Rectangle r6c0;

    private boolean isPressed = false;
    private ImageView pressed = null;
    private Rectangle pressedRec = null;

    public void selectFigure(MouseEvent mouseEvent) {

        if (pressed == mouseEvent.getSource() && isPressed) {
            String name = pressed.getId().replaceAll(".$", "");
            pressed.setImage(new Image("/Resources/" + name +".png"));
            pressed = null;
            isPressed = false;
        } else {
            pressed = (ImageView) mouseEvent.getSource();
            isPressed = true;
            String name = pressed.getId().replaceAll(".$", "");
            name += "Selected";
            pressed.setImage(new Image("/Resources/"+ name +".png"));

        }

    }

    public void moveFigure(MouseEvent mouseEvent) {
        if (isPressed && pressed != null) {
            Integer row = GridPane.getRowIndex((Node) mouseEvent.getSource());
            if (row == null) {
                row = 0;
            }

            Integer column = GridPane.getColumnIndex((Node) mouseEvent.getSource());
            if (column == null) {
                column = 0;
            }

            GridPane.setRowIndex(pressed, row);
            GridPane.setColumnIndex(pressed, column);
            String name = pressed.getId().replaceAll(".$", "");
            pressed.setImage(new Image("/Resources/" + name +".png"));

            isPressed = false;
            pressed = null;
        }
    }

    /*public Node getNodeByRowColumnIndex (final int row, final int column, GridPane gridPane) {
        Node result = null;
        ObservableList<Node> childrens = gridPane.getChildren();

        for (Node node : childrens) {
            if(gridPane.getRowIndex(node) == row && gridPane.getColumnIndex(node) == column) {
                result = node;
                break;
            }
        }

        return result;
    }*/
}