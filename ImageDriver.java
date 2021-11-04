
public class ImageDriver {

    public static void main(String[] args) {
        Image image = new Image(10,6);
        System.out.println("____________________________________________________________________");
        System.out.println("__________________________Flipping 2D Array_________________________");

        System.out.println("____________________________Starting Array__________________________");
        image.display();

        System.out.println("____________________________HFlipped Array__________________________");
        image.flip(true);
        image.display();

        System.out.println("____________________________VFlipped Array__________________________");
        image.flip(false);
        image.display();
        System.out.println("____________________________________________________________________");
        System.out.println("__________________________Rotating 2D Array_________________________");


        System.out.println("____________________________Starting Array__________________________");
        Image image2 = new Image(10,6);
        image2.display();

        System.out.println("____________________________Clockwise Array__________________________");
        image2.rotate(true);
        image2.display();

        System.out.println("____________________________Starting Array__________________________");
        Image image3 = new Image(10,6);
        image3.display();

        System.out.println("____________________________CClockwise Array__________________________");
        image3.rotate(false);
        image3.display();

        System.out.println("____________________________________________________________________");
    }
}
