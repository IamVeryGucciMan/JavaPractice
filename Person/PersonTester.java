class PersonTester {

    public static void main(String args[]){
        Person myPerson = new Person(16, "Anthony");

        System.out.println(myPerson.getAge());

        myPerson.celebrateBirthday();
        System.out.println(myPerson.getAge());

        System.out.println(myPerson.getName());

        myPerson.changeName("John");
        System.out.println(myPerson.getName());

        myPerson.celebrateBirthday();
        myPerson.celebrateBirthday();
        System.out.println(myPerson.getAge());
    }
}
