package src.main.java.com.keysoft.soap;

import javax.jws.WebService;

@WebService(
        endpointInterface = "src.main.java.com.keysoft.soap.IApplicationService",
        serviceName = "ApplicationServiceSOAP")
public class ApplicationService implements IApplicationService {

    public ApplicationService() {
    }

    @Override
    public String getAll() {
        return "Hello World";
    }
}
