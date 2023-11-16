public class Customer extends Person{
    private String clientTitle;

    public Customer(String firstName, String lastName, int age, int id, String clientTitle) {
        super(firstName, lastName, age, id);
        this.clientTitle = clientTitle;
    }

    public String getClientTitle() {
        return clientTitle;
    }

    public void setClientTitle(String clientTitle) {
        this.clientTitle = clientTitle;
    }
}
