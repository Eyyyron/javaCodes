package FirstYearShortTermAndSecondYearFirstTerm.midterms;

public class AguilarAaronKyleSecretTest {
    public static void main(String[] args){
        AguilarAaronKyleSecret sample = new AguilarAaronKyleSecret("Nick calls her.");

        System.out.print("Message to be encrypted: ");
        System.out.println(sample.toString());
        sample.encrypt(); /*Encrypt by invoking the encrypt method*/

        System.out.print("Encrypted Message: ");
        System.out.println(sample.toString());
        System.out.print("Result of Decryption: ");

        sample.decrypt(); /*Decrypt by invoking the decrypt method*/
        System.out.println(sample.toString());

        System.exit(0);
    }
} // end of AguilarAaronKyleSecretTest class
