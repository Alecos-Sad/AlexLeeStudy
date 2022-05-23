package Study;

public class Account {
    String name;
    int age;

    public static void main(String[] args) {


        Account account = new Account();
        account.setName("Pablo");
        account.setAge(34);
        account.printDeatail();
        System.out.println(account.getAge());
        System.out.println(account.getName());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void printDeatail(){
        System.out.println(name + ", " + age);
    }


}

