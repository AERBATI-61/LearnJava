package Classes.InterFace.StoreClass;

import java.beans.Customizer;

interface Member{
    public void callBack();
}

class Store{
    Member members[] = new Member[10];
    int count = 0;

    void register(Member m){
        members[count++] = m;
    }

    void inviteSale(){
        for (int i=0; i<count; i++){
            members[i].callBack();
        }
    }
}


class Customer implements Member{
    String name;
    Customer(String n){
        name = n;
    }
    public void callBack(){
        System.out.println("Ok, I will visit:  "+ name);
    }

}


public class StoreClass {
    public static void main(String[] args) {
        Store store = new Store();
        Customer customer = new Customer("Arafat");
        Customer customer1 = new Customer("Patem");
        store.register(customer);
        store.register(customer1);
        store.inviteSale();

    }
}
