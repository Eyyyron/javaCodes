package FirstYearShortTermAndSecondYearFirstTerm.midterms;

public class SubInherit extends ConsInherit{
    public SubInherit(int i) { // this calls the first constructor
        super(i); // defined for ConsInherit...

// other constructor code here...

    }
    public SubInherit(boolean b) { // this calls the second constructor
        super(b); // defined for ConsInherit...

// other constructor code here...

    }
    public SubInherit() { // this will not work since it will
    } // implicitly invoke the default
} // constructor for ConsInherit, which
// happens to be undefined...
