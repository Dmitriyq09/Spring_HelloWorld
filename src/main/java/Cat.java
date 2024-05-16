import java.util.Objects;

public class Cat {

    private String description;

    public Cat() {
        this.description = description;
    }

    public String getDiscription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(description, cat.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }
}
