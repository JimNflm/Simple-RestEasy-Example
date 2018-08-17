package Integration;

import com.google.gson.Gson;
import form.MyForm;
import form.ResultForm;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import org.apache.http.client.utils.URIBuilder;
import org.junit.Assert;
import org.junit.Test;

public class RestClientTest {
  @Test
  public void testResponse() throws Exception {
    Client client = ClientBuilder.newClient();
    URIBuilder ub = new URIBuilder("http://localhost:8080/simple-resteasy/rest/myService/myFunc");
    ub.addParameter("params", new Gson().toJson(new MyForm("A", "B")));

    WebTarget target = client.target(ub.toString());
    Response response = target.request().get();

    try {
      String result = response.readEntity(String.class);
      ResultForm f = new Gson().fromJson(result, ResultForm.class);

      // TODO: debug
      System.out.println("response: " + result);

      Assert.assertEquals(200, response.getStatus());
      Assert.assertEquals("AB", f.getResult());
    } finally {
      response.close();
      client.close();
    }
  }
}
