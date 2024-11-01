package Builders;

import ComponentsClass.Controller.Controller;
import ComponentsClass.Identification.Identification;
import ComponentsClass.Storage.Storage;
import ComponentsClass.Microcontroller.Microcontroller;
import ComponentsClass.ConnectionType.ConnectionType;

public interface McUnitBuilderInterface {
    public void addMicrocontroller(Microcontroller microcontroller);
    public void addConnectionType(ConnectionType connectionType);
    public void addIdentification(Identification identification);
    public void addStorage(Storage storage);
    public void addController(Controller controller);
}
