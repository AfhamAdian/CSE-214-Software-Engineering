package Builders;

import ComponentsClass.McUnit.McUnit;
import ComponentsClass.Microcontroller.*;
import ComponentsClass.ConnectionType.*;
import ComponentsClass.Identification.*;
import ComponentsClass.Storage.*;
import ComponentsClass.Controller.*;
import ComponentsClass.TicketingSystem.*;
import ComponentsClass.Packages.Package;
import Factory.PackageFactory;

public class Director {

    // can build withut connectionTypeName ConnectionType Attribute is
    public McUnit prepareMcUnit( String microcontrollerName ) {
        McUnitConcreteBuilder mcUnitBuilder = new McUnitConcreteBuilder();
        
        if( microcontrollerName.equalsIgnoreCase("ATMega32")){
            mcUnitBuilder.addMicrocontroller( new Mega32());
            mcUnitBuilder.addIdentification( new RFID());
            mcUnitBuilder.addStorage( new ExternalSD());
            mcUnitBuilder.addController( new ExternalController());
        }
        else if( microcontrollerName.equalsIgnoreCase("ArdinoMega")){
            mcUnitBuilder.addMicrocontroller( new Ardino());
            mcUnitBuilder.addIdentification( new RFID());
            mcUnitBuilder.addStorage( new ExternalSD());
            mcUnitBuilder.addController( new ExternalController());
        }
        else if( microcontrollerName.equalsIgnoreCase("RaspberryPI")){
            mcUnitBuilder.addMicrocontroller(new RasPI());
            mcUnitBuilder.addIdentification( new NFC());
            mcUnitBuilder.addStorage( new InternalStoragePI());
            mcUnitBuilder.addController(new InternalTouchScreenPI());
        }
        return mcUnitBuilder.getMcUnit();
    }


    public McUnit prepareMcUnit( String microcontrollerName,String connectionTypeName ) {
        McUnitConcreteBuilder mcUnitBuilder = new McUnitConcreteBuilder();
        
        if( microcontrollerName.equalsIgnoreCase("ATMega32")){
            mcUnitBuilder.addMicrocontroller( new Mega32());
            mcUnitBuilder.addIdentification( new RFID());
            mcUnitBuilder.addStorage( new ExternalSD());
            mcUnitBuilder.addController( new ExternalController());
            
            if( connectionTypeName.equalsIgnoreCase("WIFI")){
                mcUnitBuilder.addConnectionType( new Wifi());
            }else if( connectionTypeName.equalsIgnoreCase("GSM")){
                mcUnitBuilder.addConnectionType( new GSM());
            }

        }
        else if( microcontrollerName.equalsIgnoreCase("ArdinoMega")){
            mcUnitBuilder.addMicrocontroller( new Ardino());
            mcUnitBuilder.addIdentification( new RFID());
            mcUnitBuilder.addStorage( new ExternalSD());
            mcUnitBuilder.addController( new ExternalController());

            if( connectionTypeName.equalsIgnoreCase("WIFI")){
                mcUnitBuilder.addConnectionType( new Wifi());
            }else if( connectionTypeName.equalsIgnoreCase("GSM")){
                mcUnitBuilder.addConnectionType( new GSM());
            }
        }
        else if( microcontrollerName.equalsIgnoreCase("RaspberryPI")){
            mcUnitBuilder.addMicrocontroller(new RasPI());
            mcUnitBuilder.addIdentification( new NFC());
            mcUnitBuilder.addStorage( new InternalStoragePI());
            mcUnitBuilder.addController(new InternalTouchScreenPI());

            if( connectionTypeName.equalsIgnoreCase("WIFI")){
                mcUnitBuilder.addConnectionType( new Wifi());
            }else if( connectionTypeName.equalsIgnoreCase("GSM")){
                mcUnitBuilder.addConnectionType( new GSM());
            }else if( connectionTypeName.equalsIgnoreCase("Ethernet")){
                mcUnitBuilder.addConnectionType( new Ethernet());
            }
        }
        return mcUnitBuilder.getMcUnit();
    }


    // director choices
    public TicketingSystem prepareChoices(String packagename, String webServerName, String connentionTypeName){
        TicketingSystemBuilderConcrete choiceBuilder = new TicketingSystemBuilderConcrete();
        
        // creating package factory for package creation
        PackageFactory factory = new PackageFactory();
        Package p = factory.createPackage(packagename);

        choiceBuilder.addPackage(p);
        choiceBuilder.addWebServerString(webServerName);
        choiceBuilder.addConnectionTypeString(connentionTypeName);
        return choiceBuilder.getChoices();
    }

}
