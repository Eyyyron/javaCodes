package SecondYearSecondTerm.CompProg3.RmiSampleWithCallback.shared;

public class UserExistsException extends Exception {
    public UserExistsException(String msg) {
        super(msg);
    }
}
