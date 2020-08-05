package dbConnection;

public class Cities {

    private String cityid;
    private String cityName;
    private String population;
    private String noOfSchools;

    public Cities(String cityid, String cityName, String population, String noOfSchools) {
        this.cityid = cityid;
        this.cityName = cityName;
        this.population = population;
        this.noOfSchools = noOfSchools;
    }

    public String getCityid() {
        return cityid;
    }

    public String getCityName() {
        return cityName;
    }

    public String getPopulation() {
        return population;
    }

    public String getNoOfSchools() {
        return noOfSchools;
    }
}
