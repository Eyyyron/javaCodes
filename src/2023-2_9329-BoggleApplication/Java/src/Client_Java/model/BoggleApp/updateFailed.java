package Client_Java.model.BoggleApp;


/**
* BoggleApp/updateFailed.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from BoggleClient.idl
* Sunday, May 12, 2024 2:16:16 PM PST
*/

public final class updateFailed extends org.omg.CORBA.UserException
{
  public String reason = null;

  public updateFailed ()
  {
    super(updateFailedHelper.id());
  } // ctor

  public updateFailed (String _reason)
  {
    super(updateFailedHelper.id());
    reason = _reason;
  } // ctor


  public updateFailed (String $reason, String _reason)
  {
    super(updateFailedHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class updateFailed
