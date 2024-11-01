package Builders;

import ComponentsClass.Controller.Controller;
import ComponentsClass.Identification.Identification;
import ComponentsClass.Storage.Storage;
import ComponentsClass.Microcontroller.Microcontroller;
import ComponentsClass.ConnectionType.ConnectionType;
import ComponentsClass.ConnectionType.Ethernet;
import ComponentsClass.McUnit.McUnit;
import ComponentsClass.ConnectionType.*;

public class McUnitConcreteBuilder implements McUnitBuilderInterface {
    private Microcontroller microcontroller;
    private ConnectionType connectionType;
    private Identification identification;
    private Storage storage;
    private Controller controller;
    
    public McUnitConcreteBuilder() {
        this.microcontroller = null;
        this.connectionType = null;
        this.identification = null;
        this.storage = null;
        this.controller = null;
    }

    @Override
    public void addMicrocontroller(Microcontroller microcontroller) {
        this.microcontroller = microcontroller;
    }
    @Override
    public void addConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType;
    }
    @Override
    public void addIdentification(Identification identification) {
        this.identification = identification;
    }
    @Override
    public void addStorage(Storage storage) {
        this.storage = storage;
    }
    @Override
    public void addController(Controller controller) {
        this.controller = controller;
    }


    public void addConnectionTypeString(String connectionType) {
        if( connectionType.equalsIgnoreCase("WIFI")){
            this.connectionType = new Wifi();
        }else if( connectionType.equalsIgnoreCase("GSM")){
            this.connectionType = new GSM();
        }else if ( connectionType.equalsIgnoreCase("Ethernet")){
            this.connectionType = new Ethernet();
        }else{
            System.out.println("Invalid Connection Type");
        }
    }
    public McUnit getMcUnit() {
        return new McUnit(microcontroller, connectionType, identification, storage, controller);
    }
}
