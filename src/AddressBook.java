import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> myBuddies;

    public AddressBook() {
        myBuddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo aBuddy) {
        if(aBuddy != null)
            myBuddies.add(aBuddy);
    }

    public BuddyInfo removeBuddy(int index){
        if(index >= 0 && index < myBuddies.size()) {
           return myBuddies.remove(index);
        }
        return null;
    }

    public void printMessage() {
        System.out.println("Completed Lab 3!");
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
        addressBook.printMessage();
    }

}
