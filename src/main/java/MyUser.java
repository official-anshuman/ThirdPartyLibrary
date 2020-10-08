import com.opencsv.bean.CsvBindByName;
import jdk.nashorn.internal.objects.annotations.Setter;

public class MyUser {
    public MyUser (String name, String email, String phone, String country) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.country = country;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public void setPhone (String phone) {
        this.phone = phone;
    }

    public void setCountry (String country) {
        this.country = country;
    }

    @CsvBindByName(column = "name")
    private String name;
    @CsvBindByName(column = "email")
    private String email;
    @CsvBindByName(column = "phone")
    private String phone;
    @CsvBindByName(column = "country")
    private String country;

    public String getCountry ( ) {
        return country;
    }

    public String getName ( ) {
        return name;
    }

    public String getEmail ( ) {
        return email;
    }

    public String getPhone ( ) {
        return phone;
    }
}
