interface Filterable {
    void apply_filter(String type);
    void reset_filter();
}

class ImageProcessor implements Filterable {
    public void apply_filter(String type) {
        System.out.println("Image filter: " + type);
    }
    public void reset_filter() {
        System.out.println("Image reset");
    }
}