package SecondYearSecondTerm.CompProg3.RmiSampleWithCallback.shared;

// custom exception class used to denote an error where
// a client tries to log out/send broadcast while not
// logged in
public class NotLoggedInException extends Exception {
}