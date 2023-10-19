package part_two.ex_four.entities;

public class Video extends Media {
    private final Long duration;

    public Video(String name, Long size, Long duration) {
        this.name = name;
        this.size = size;
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        System.out.printf("\"%s\": %d bytes; %d seconds.%n", name, size, duration);
    }
}
