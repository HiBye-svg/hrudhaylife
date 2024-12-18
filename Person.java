/**
 * Person class for storing info about the person
 */
public class Person {
    
    private String name;
    /**
    *default no arguement constructor for Person class
    * first constructer
    */
    public Person() {}
    /**
     * @ param string name of user
     * constructs person with specified name
     * second constructor
     */
    public Person(String name) {
        this.name = name;
    }
     /**
      * @param string name of user
      * sets the given name(an accessor method)
    */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Starts life journey of the user
     * using object of class LifeJourney
     */
    public void liveALife() {
        LifeJourney journey = new LifeJourney();
        journey.liveALife(name);
    }
}