public interface Figure {
    double countPerimeter();
    double countArea();
    default String prepareDescription(){
        return this.getClass().getSimpleName() +
                "\npole: " + this.countArea() +
                "\nobwód: " + this.countPerimeter();
    }
}
