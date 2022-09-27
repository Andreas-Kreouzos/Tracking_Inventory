package exceptions;

public class ItemSerialCannotBeEmptyException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Serial number cannot be empty";
	}
}
