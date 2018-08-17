package form;

public class MyForm {
  private String paramA;
  private String paramB;

  public MyForm(String a, String b) {
    this.paramA = a;
    this.paramB = b;
  }

  public String getParamA() {
    return paramA;
  }

  public void setParamA(String paramA) {
    this.paramA = paramA;
  }

  public String getParamB() {
    return paramB;
  }

  public void setParamB(String paramB) {
    this.paramB = paramB;
  }
}
