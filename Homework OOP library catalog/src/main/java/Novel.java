

public class Novel extends Book {
    private Type type;

    public Novel(String name, int numberOfPages, Type type) {
        super(name, numberOfPages);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "name='" + super.getName() + '\'' +
                ", numberOfPages='" + super.getNumberOfPages() + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
