public class ClassA {
    // exeptions example
    // invocation counter
    // regexp
    // values in range
    // constructor tests

    private String stringProperty;
    private Integer integerProperty;

    public ClassA() {

    }

    public ClassA(Integer integerProperty) {
        if (integerProperty >= 0) this.integerProperty = integerProperty;
        else throw new IllegalArgumentException();
    }

    public ClassA(String stringProperty, Integer integerProperty) {
        this.stringProperty = stringProperty;
        this.integerProperty = integerProperty;
    }


    public double sum(double a, double b) {
        return a + b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double power(double b, double e) {
        if (e == 1) return b;
        else return b * power(b, e - 1);
    }


    public String getStringProperty() {
        return stringProperty;
    }

    public void setStringProperty(String stringProperty) {
        this.stringProperty = stringProperty;
    }

    public Integer getIntegerProperty() {
        return integerProperty;
    }

    public void setIntegerProperty(Integer integerProperty) {
        this.integerProperty = integerProperty;
    }
}
