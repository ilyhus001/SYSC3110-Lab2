import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddyList;

    public AddressBook() {
        buddyList = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy) {
        buddyList.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        for (BuddyInfo i: buddyList) {
            if(i == buddy) {
                buddyList.remove(buddy);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }

}
