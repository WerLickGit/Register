public class UserRegistration {
    private String name;
    private int age;
    private String email;
    private String password;

    public UserRegistration(String name, int age, String email, String password) throws FailedRegisterException {
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;


        // checked exceptions
        if (this.age < 12) {
            throw new AgeException("Ошибка регистрации! Ваш возраст меньше 12 лет");
        }
        if (this.name.length() < 2) {
            throw new NameException("Ошибка регситрации! Ваше имя слишком короткое, попробуйте снова");
        }
        if (this.email.length() < 10) {
            throw new EmailException("Ошибка регистрации! Ваща электронная почта некорректна");
        }
        if (this.password.length() < 4 || this.password.length() > 16) {
            throw new PasswordException("Ошибка регистрации! Ваш пароль либо слишком маленький, либо слишком большой");
        }

        // unchecked exceptions
        if (this.name.matches(".*\\d")) {
            throw new SomethingException("Ошибка создания экземпляра, имя не должно содержать цифр");
        }
        if (!this.email.contains("@")) {
            throw new SomethingException("Ошибка создания экземпляра, почта обязана содержать в себе символ @, а также окончание .com");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "UserRegistration{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", password='" + "secret" + '\'' +
                '}';
    }
}
