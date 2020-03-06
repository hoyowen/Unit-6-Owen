public class Person {
    int myAge;
    String myName;
    public Person(int myAge, String myName){
        this.myAge = myAge;
        this.myName = myName;
    }
    public String toString(){
        return myName + ", " + myAge;
    }
    public int getAge(){
        return myAge;
    }
    public String getName(){
        return myName;
    }
}