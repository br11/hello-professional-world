package how;

/**
 * Saudações.
 */
public enum Greetings {

	HELLO("Olá"),
	GOOD_MORNING("Bom dia"),
	GOOD_AFTERNOON("Boa tarde"),
	GOOD_NIGHT("Boa noite"),
	BYE("Tchau");

	private String message;

    Greetings(String message) {
        setMessage(message);
    }

	private void setMessage(String message) {
        this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
