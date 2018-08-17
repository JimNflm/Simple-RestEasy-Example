package rest;

import com.google.gson.Gson;
import form.MyForm;
import form.ParamForm;
import form.ResultForm;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import org.jboss.resteasy.annotations.Form;

@Path("/myService")
public class MyService {
  @GET
  @Path("/myFunc")
  public Response myFunc(@Form ParamForm param) {
    ResultForm result = doSomething(param);
    return Response.status(200).entity(new Gson().toJson(result)).build();
  }

  public ResultForm doSomething(ParamForm f) {
    // TODO: debug
    System.out.println("doSomething params:" + f.getParams());

    MyForm myForm = new Gson().fromJson(f.getParams(), MyForm.class);

    // TODO: debug
    System.out.println("doSomething A: " + myForm.getParamA());
    System.out.println("doSomething B: " + myForm.getParamB());

    return new ResultForm(myForm.getParamA() + myForm.getParamB());
  }
}
