package oops;

public class AccessSpecifire {
    public static void main(String[] args) {
    Bank myAcc = new Bank();
    myAcc.userName = "dhruv";
    // myAcc.setPassword("bdjsd");
}
}
class Bank{
    public String userName;
    private String password;
    public void setPassword(String ped){
        password = ped;
    }
}