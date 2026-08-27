public class Main {
    public static void main(String[] args) {
        boolean registerStatus = true;
        try {
            UserRegistration user1 = new UserRegistration("Bogdan", 15, "sharlaybogban@gmail.com", "ThisIsMyPassword");
            System.out.println(user1);
        } catch (FailedRegisterException e) {
            registerStatus = false;
            System.out.println("[ERROR LOG]: " + e.getMessage());
        } catch (SomethingException ex) {
            System.out.println("[VALIDATION LOG]: " + ex.getMessage());
        } finally {
            System.out.println("Попытка регистрации завершена, результат ниже:");
            if (registerStatus) {
                System.out.printf("Пользователь успешно зарегестрирован!\n");
            } else {
                System.out.println("В ходе регситрации произошла ошибка");
            }
        }
    }
}