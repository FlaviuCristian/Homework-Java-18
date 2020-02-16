public class MainPhone {
    public static void main(String[] args) {

        Contact contact1 = new Contact("Pop Ionescu", "0741123698");
        Contact contact2 = new Contact("Popescu Ion", "0789456852");

        Agenda agenda = new Agenda();
        agenda.addToAgenta(contact1);
        agenda.addToAgenta(contact2);


        Agenda obj= new Agenda();
        obj.makeACall(contact1);
        obj.sendSMS(contact2);
    }
}
