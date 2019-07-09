import java.awt.*;

public class ShapeFactory {

    public  static Shape creatShape(String shape) {
        if (shape.isEmpty()) {
            return null;
        }
        else if (shape.equals("circle")) {
            return new Cricle();
        }
        return new Rectangle();
    }
}

