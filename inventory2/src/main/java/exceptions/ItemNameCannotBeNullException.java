package exceptions;

public class ItemNameCannotBeNullException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Name cannot be null";
	}
}
