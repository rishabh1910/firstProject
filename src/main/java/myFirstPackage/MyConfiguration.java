package myFirstPackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

public class MyConfiguration extends Configuration{

    private String url;

    @JsonProperty("database")
    private DataSourceFactory database = new DataSourceFactory();

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DataSourceFactory getDataSourceFactory() {
        return database;
    }
}
