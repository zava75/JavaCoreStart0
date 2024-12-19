package lesson11_parametClaas;

public class Runner {

    public static void main(String[] args) {

        Footer footer = new Footer();
        Sidebar sidebar = new Sidebar();
        Header header = new Header();

        Body<Sidebar,Footer> body = new Body<Sidebar,Footer>(sidebar,footer);
        Body<Header,Footer> body2 = new Body<Header,Footer>(header,footer);

        body.getS().sidebarPrint();
        body2.getS().headPrint();
        System.out.println(body2.getBody());


    }
}
