package myFirstPackage;

import com.codahale.metrics.annotation.Timed;
import io.dropwizard.hibernate.UnitOfWork;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;


@Path("/resource")
public class MyResource {

    private InfoDao infoDao;

    public MyResource(InfoDao infoDao) {
        this.infoDao = infoDao;
    }

    @GET
    @Timed
    @Path("/getName")
    public String getName() {
        return "Rishabh";
    }


    @POST
    @Timed
    @Path("/postName")
    public String postName(String name) {
        System.out.println("Name given by : "+name);
        return "Ok";
    }

    @GET
    @Timed
    @UnitOfWork
    @Path("/findAllEmp")
    public List<Info> findAllEmp() {
        System.out.println("All Emp  : "+infoDao.findAll());
        return infoDao.findAll();
    }

}

