public class ArtAlbums extends Book {
    private PaperQuality paperQuality;

    public ArtAlbums(String name, int numberOfPages, PaperQuality paperQuality) {
        super(name, numberOfPages);
        this.paperQuality = paperQuality;
    }

    public PaperQuality getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(PaperQuality paperQuality) {
        this.paperQuality = paperQuality;
    }

    @Override
    public String toString() {
        return "ArtAlbums{" +
                "name='" + super.getName() + '\'' +
                ", numberOfPages='" + super.getNumberOfPages() + '\'' +
                ", paperQuality='" + paperQuality + '\'' +
                '}';
    }
}