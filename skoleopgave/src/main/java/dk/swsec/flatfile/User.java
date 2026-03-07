package dk.swsec.flatfile;

public class User {
    private int person_id;
    private String first_name;
    private String last_name;
    private String address;
    private String street_number;
    private String password;
    public boolean enabled;

    public User(int newId, String first_name, String last_name, String address, 
        String street_number, String password) {
            this.person_id = newId;
            this.first_name = first_name;
            this.last_name = last_name;
            this.address = address;
            this.street_number = street_number;
            this.password = password;
            enabled = true;
        
    }
    public int getPerson_id() {
        return person_id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getStreet_number() {
        return street_number;
    }
    public void setStreet_number(String street_number) {
        this.street_number = street_number;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
