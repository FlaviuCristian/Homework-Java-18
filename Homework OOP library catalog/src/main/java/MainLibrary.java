public class MainLibrary {
    public static void main(String[] args) {
        Novel novel1 = new Novel("Nuvela 1", 10, Type.MYSTERY);
        Novel novel2 = new Novel("Nuvela 2", 20, Type.SCIENCE_FICTION);
        ArtAlbums artAlbums1 = new ArtAlbums("Art Album 1", 5, PaperQuality.GOOD);
        ArtAlbums artAlbums2 = new ArtAlbums("Art Album 2", 8, PaperQuality.BAD);

        Library library = new Library();
        library.addToLibrary(novel1);
        library.addToLibrary(novel2);
        library.addToLibrary(artAlbums1);
        library.addToLibrary(artAlbums2);

        library.listFromLibrary();

        library.deleteFromLibrary(artAlbums2);

        library.listFromLibrary();
    }
}