package exceptions;

public class ItemSerialCannotBeNullException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Serial number cannot be null";
	}
}
