package ComponentsClass.Packages;

import ComponentsClass.McUnit.*;
import ComponentsClass.Display.*;
import Builders.*;

public class Advanced extends Package {

    public Advanced() { 
        Director director = new Director();
        super.mcUnit = director.prepareMcUnit("RaspberryPI");
        super.display = new OLED();
    }
    
    @Override
    public String getPackageName() {
        return "advanced";
    }
    @Override
    public String getPackageDisplay() {
        return "OLED";
    }
    @Override
    public McUnit getPackageMcUnit() {
        return super.mcUnit;
    }
    
}
