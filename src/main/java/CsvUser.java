import com.opencsv.bean.CsvBindByName;

public class CsvUser {
    @CsvBindByName(column = "name")
    private String name;
    @CsvBindByName(column = "email",required = false)
    private String email;
    @CsvBindByName(column = "phone")
    private String phoneNo;
    @CsvBindByName(column = "country")
    private String country;

    public CsvUser (String name, String email, String phoneNo, String country) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.country = country;
    }

    public CsvUser () {
    }

    @Override
    public String toString ( ) {
        return "CsvUser{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getName ( ) {
        return name;
    }

    public String getEmail ( ) {
        return email;
    }

    public String getPhoneNo ( ) {
        return phoneNo;
    }

    public String getCountry ( ) {
        return country;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public void setPhoneNo (String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setCountry (String country) {
        this.country = country;
    }
}
