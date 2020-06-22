package cardealership;

public class Customer extends Person {
    
    boolean testDriveApproval;
    String driversLicenseNum;

    public Customer(boolean testDriveApproval, int customerID, String driversLicenseNum, String firstName, String lastName, String emailAddress, String phoneNumber, Address address, boolean status, role role) {
        super(firstName, lastName, emailAddress, phoneNumber, address, status, role);
        this.testDriveApproval = testDriveApproval;
        this.driversLicenseNum = driversLicenseNum;
        setRole(role.CUSTOMER);
    }

    public boolean getTestDriveApproval() {
        return testDriveApproval;
    }

    public void setTestDriveApproval(boolean testDriveApproval) {
        this.testDriveApproval = testDriveApproval;
    }

    public String getDriversLicenseNum() {
        return driversLicenseNum;
    }

    public void setDriversLicenseNum(String driversLicenseNum) {
        this.driversLicenseNum = driversLicenseNum;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public Address getAddress() {
        return address;
    }

    @Override
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public boolean isStatus() {
        return status;
    }
    
    @Override
    public void setStatus(boolean status) {
        this.status = status;
    }
}
