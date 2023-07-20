package niit.com.vn.springboot08.model;

public class Image {
    private int id;
    private String name;

    public Image(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}