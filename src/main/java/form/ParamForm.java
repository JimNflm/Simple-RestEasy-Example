package form;

import javax.ws.rs.QueryParam;

public class ParamForm {
  @QueryParam("params")
  private String params;

  public ParamForm() {}

  public ParamForm(String p) {
    this.params = p;
  }

  public String getParams() {
    return params;
  }

  public void setParams(String params) {
    this.params = params;
  }
}
