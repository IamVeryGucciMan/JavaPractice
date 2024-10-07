public class Person {
    public Person(int age, String name){
        personAge = age ;
        personName = name ;
    }

    private int personAge = 0;
    private String personName = "N/A";

    public int getAge(){
        return this.personAge;
    }

    public String getName(){
        return this.personName;
    }

    public void celebrateBirthday(){
        this.personAge += 1 ;
    }

    public void changeName(String newName){
        this.personName = newName;
    }
}

