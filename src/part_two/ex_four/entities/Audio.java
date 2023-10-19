package part_two.ex_four.entities;

public class Audio extends Media {
    private final Long duration;

    public Audio(String name, Long size, Long duration) {
        this.name = name;
        this.size = size;
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        System.out.printf("\"%s\": %d bytes; %d seconds.%n", name, size, duration);
    }
}
