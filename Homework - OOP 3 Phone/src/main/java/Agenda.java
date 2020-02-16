public class Agenda {

    public void addToAgenta(Contact contact) {

        System.out.println("A fost adaugat contactul " + contact);

    }

    public void makeACall(Contact contact){
        System.out.println("A fost apelat contactul " + contact);
    }

    public void sendSMS(Contact contact){

        System.out.println("A fost expediat SMS-ul catre " + contact);
    }
}
