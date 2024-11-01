package ComponentsClass.McUnit;

import ComponentsClass.Controller.Controller;
import ComponentsClass.Identification.Identification;
import ComponentsClass.Storage.Storage;
import ComponentsClass.Microcontroller.Microcontroller;
import ComponentsClass.ConnectionType.ConnectionType;
import ComponentsClass.ConnectionType.Ethernet;
import ComponentsClass.ConnectionType.GSM;
import ComponentsClass.ConnectionType.Wifi;

public class McUnit {

    private Microcontroller microcontroller;
    private ConnectionType connectionType;
    private Identification identification;
    private Storage storage;
    private Controller controller;

    public McUnit() {
        this.microcontroller = null;
        this.connectionType = null;
        this.identification = null;
        this.storage = null;
        this.controller = null;
    }

    public McUnit( Microcontroller microcontroller, ConnectionType connectionType, Identification identification, Storage storage, Controller controller ) {
        this.microcontroller = microcontroller;
        this.connectionType = connectionType;
        this.identification = identification;
        this.storage = storage;
        this.controller = controller;
    }
    
    public ConnectionType getConnectionType() {
        return connectionType;
    }
    public Microcontroller getMicrocontroller() {
        return microcontroller;
    }
    public Identification getIdentification() {
        return identification;
    }
    public Storage getStorage() {
        return storage;
    }
    public Controller getController() {
        return controller;
    }

    // method to set connection type later after choice
    public void setConnectionTypeString( String connectionType ) 
    {
        if( connectionType.equalsIgnoreCase("WIFI")){
            this.connectionType = new Wifi();
        }else if( connectionType.equalsIgnoreCase("GSM")){
            this.connectionType = new GSM();
        }else if ( connectionType.equalsIgnoreCase("Ethernet")){
            if( this.microcontroller.getMicrocontrollerName().equalsIgnoreCase("RaspberryPI") )
                this.connectionType = new Ethernet();
            else 
                System.out.println("Invalid Connection Type");
        }else{
            System.out.println("Invalid Connection Type");
        }
    }

    @Override
    public String toString()
    {
        System.out.println("        Microcontroller : " + microcontroller.getMicrocontrollerName());
        System.out.println("        Connection Type : " + connectionType.getConnectionTypeName());
        System.out.println("        Identification : " + identification.getIdentificationName());
        System.out.println("        Storage : " + storage.getStorageName());
        System.out.println("        Controller : " + controller.getControllerName());
        return "";
    }
}
