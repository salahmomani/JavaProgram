package part4.ooplist.Personalinformation;

public class PersonalInformationCollection {
private String Firstname;
    private String Lastname;
    private int Identificationnumber;

    public PersonalInformationCollection(String Firstname,String Lastname,int Identificationnumber){
        this.Firstname=Firstname;
        this.Lastname=Lastname;
        this.Identificationnumber=Identificationnumber;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public void setIdentificationnumber(int identificationnumber) {
        Identificationnumber = identificationnumber;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public int getIdentificationnumber() {
        return Identificationnumber;
    }

    @Override
    public String toString() {
        return
                "Firstname=" + Firstname +"\n"+
                "Lastname=" + Lastname+"\n" ;
    }
}
