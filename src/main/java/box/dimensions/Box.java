package box.dimensions;

public class Box {

    public int width;

    public int height;

    public int length;

    public int volume;


    public Box(int width, int height, int length) {

        this.width = width;
        this.height = height;
        this.length = length;


        System.out.println("width = " + width + " height = " + height + " length = " + length);

    }


    public Box(int volume) {
        this.volume = volume;

        System.out.println("width * height * length = " + volume);
    }

}
