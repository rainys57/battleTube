package data;
// Generated Nov 20, 2014 9:23:46 PM by Hibernate Tools 4.3.1



/**
 * Country generated by hbm2java
 */
public class Country  implements java.io.Serializable {


     private int countryId;
     private String name;

    public Country() {
    }

	
    public Country(int countryId) {
        this.countryId = countryId;
    }
    public Country(int countryId, String name) {
       this.countryId = countryId;
       this.name = name;
    }
   
    public int getCountryId() {
        return this.countryId;
    }
    
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}

