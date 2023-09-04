package pl.javastart.validationtask;

import jakarta.validation.constraints.*;

public class RegisterFormDto {
    @NotEmpty
    @Size(min = 3)
    private String firstName;

    @NotEmpty
    @Size(min = 3)
    private String surname;

    @NotEmpty
    private String address;

    @NotEmpty
    @Pattern(regexp = "[0-9]{2}-[0-9]{3}", message = "Wpisz poprawny kod pocztowy")
    private String postalCode;

    @NotEmpty
    private String city;

    @NotEmpty
    @Email(message = "musi być poprawnie sformatowanym adresem e-mail")
    private String email;

    @NotEmpty
    @Size(min = 8, message = "Hasło musi mieć co najmniej {min} znaków")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\W).+$", message = "Hasło musi zawierać min. 1 znak mały, duży i znak specjalny")
    private String password;

    @AssertTrue(message = "Akceptacja regulaminu jest wymagana")
    private boolean termsAgreement;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isTermsAgreement() {
        return termsAgreement;
    }

    public void setTermsAgreement(boolean termsAgreement) {
        this.termsAgreement = termsAgreement;
    }
}
