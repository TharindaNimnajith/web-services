package src.main.java.com.keysoft.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IApplicationService {

    @WebMethod
    public String getAll();

}
