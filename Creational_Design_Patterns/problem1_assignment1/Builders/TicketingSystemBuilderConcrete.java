package Builders;

import ComponentsClass.ConnectionType.ConnectionType;
import ComponentsClass.WebServer.*;
import ComponentsClass.Packages.Package;
import ComponentsClass.TicketingSystem.*;
import ComponentsClass.ConnectionType.*;

public class TicketingSystemBuilderConcrete implements TicketingSystemBuilderInterface {
    private Package pack;
    private WebServer webserver;
    private ConnectionType connectionType;
    
    @Override
    public void addPackage(Package p){
        this.pack = p;
    }
    @Override
    public void addWebServerString(String ws){
        if( ws.equalsIgnoreCase("NodeJs") ){
            this.webserver = new NodeJs();
        } else if( ws.equalsIgnoreCase("Ruby") ){
            this.webserver = new Ruby();
        } else if( ws.equalsIgnoreCase("Django") ){
            this.webserver = new Django();
        } else{
            System.out.println("Invalid webserver");
            this.webserver = null;
        }
    }
    @Override
    public void addConnectionTypeString( String ct){
        if( ct.equalsIgnoreCase("Ethernet") && this.pack.getPackageMcUnit().getMicrocontroller().getMicrocontrollerName().equalsIgnoreCase("RaspberryPI") ){
            this.connectionType = new Ethernet();
        } else if( ct.equalsIgnoreCase("GSM") ){
            this.connectionType = new GSM();
        } else if( ct.equalsIgnoreCase("Wifi") ){
            this.connectionType = new Wifi();
        }else{
            System.out.println("Invalid connection type");
            this.connectionType = null;
        }
    }

    public TicketingSystem getChoices(){
        return new TicketingSystem(this.pack, this.webserver, this.connectionType);
    }
}
