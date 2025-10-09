package enams;

public enum PropertyEnums {

    ERROR_MSG("Неверный email или пароль"),
    TITLE_ENGLISH("Sign in"),
    TITLE_RUSSIAN("Вход");

    private final String value;

    PropertyEnums(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}