package exceptions;

public class ItemValueCannotBeNullException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Value of the item cannot be null";
	}
}
