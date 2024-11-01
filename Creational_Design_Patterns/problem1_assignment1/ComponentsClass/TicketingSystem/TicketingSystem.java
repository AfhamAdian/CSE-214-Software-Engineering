package ComponentsClass.TicketingSystem;

import ComponentsClass.ConnectionType.ConnectionType;
import ComponentsClass.WebServer.WebServer;
import ComponentsClass.Packages.Package;
import ComponentsClass.PaymentTerminal.PaymentTerminal;

public class TicketingSystem {
    private PaymentTerminal paymentTerminal;
    private Package pack;
    private WebServer webserver;
    private ConnectionType connectionType;
    
    public TicketingSystem(Package p, WebServer ws, ConnectionType ct){
        this.pack = p;
        this.webserver = ws;
        this.connectionType = ct;
        this.pack.getPackageMcUnit().setConnectionTypeString(ct.getConnectionTypeName());
        this.paymentTerminal = new PaymentTerminal();
    }
    
    public Package getPack() {
        return pack;
    }
    public WebServer getWebServer() {
        return webserver;
    }
    public ConnectionType getConnectionType() {
        return connectionType;
    }
    public PaymentTerminal getPaymentTerminal() {
        return paymentTerminal;
    }

    @Override
    public String toString() {
        System.out.println("\nYour Choices : ");
        System.out.println(pack);
        System.out.println("    Web Server : " + webserver.getWebServerName());
        System.out.println("    Connection Type : " + connectionType.getConnectionTypeName());
        return "";
    }
}
