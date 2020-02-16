public class MainStore {
    public static void main(String[] args) {
        Samsung samsung1 = new Samsung("Samsung","white",90, Model.Note10);
        Samsung samsung2 = new Samsung("Samsung","black",100, Model.Galaxy10);
        Iphone iphone1 = new Iphone("Iphone", "Silver",85, Model.Iphone_X);
        Iphone iphone2 = new Iphone("Iphone", "Black",80, Model.Iphone_11);

        Store store = new Store();
        store.addToPhoneList(samsung1);
        store.addToPhoneList(samsung2);
        store.addToPhoneList(iphone1);
        store.addToPhoneList(iphone2);
    }
}