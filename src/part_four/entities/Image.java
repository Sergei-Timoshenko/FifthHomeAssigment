package part_four.entities;

public class Image extends Media {
    private final Integer width;
    private final Integer height;

    public Image(String name, Long size, Integer width, Integer height) {
        this.name = name;
        this.size = size;
        this.width = width;
        this.height = height;
    }

    @Override
    public void displayInfo() {
        System.out.printf("\"%s\": %d bytes; %d x %d px.%n", name, size, width, height);
    }
}
