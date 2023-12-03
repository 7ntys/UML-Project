package domain;

public class Customer extends Person {
    private String clientTitle;

    private Customer(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.id = builder.id;
        this.clientTitle = builder.clientTitle;
    }

    @Override
    public String toString() {
        return super.toString() + "domain.Customer{" +
                "clientTitle='" + clientTitle + '\'' +
                '}';
    }

    public String getClientTitle() {
        return clientTitle;
    }

    public void setClientTitle(String clientTitle) {
        this.clientTitle = clientTitle;
    }

    public static class Builder {
        private String clientTitle;
        protected String firstName;
        protected String lastName;
        protected int age;
        protected String id;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setClientTitle(String clientTitle) {
            this.clientTitle = clientTitle;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
