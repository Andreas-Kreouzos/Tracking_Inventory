package exceptions;

public class ItemNameCannotBeEmptyException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Name cannot be empty";
	}
}
