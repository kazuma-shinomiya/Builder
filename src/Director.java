public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("aaaaaaaaa");
        builder.makeItems(new String[]{"a", "b", "c"});
        builder.close();
    }
}
