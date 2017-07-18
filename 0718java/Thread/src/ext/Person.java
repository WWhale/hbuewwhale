package ext;

/**
 * Created by lanouhn on 17/7/18.
 */
public class Person {
    //在同一个包下可以使用 子类也可以使用
    protected String country;

    public Person(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
