package clients;

public class Alex extends Client {
    public String name;

    @Override
    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    public String getName() {
        return this.name;
    }
}
