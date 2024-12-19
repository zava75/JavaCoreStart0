package lesson11_parametClaas;

public class Body <S,T extends Html> {

    private S s;
    private T t;
    private String body;

    {
        body = "Body";
    }

    public Body(S s, T t) {
        this.s = s;
        this.t = t;
    }

    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void printBody() {

        System.out.println(body);

    }
}
