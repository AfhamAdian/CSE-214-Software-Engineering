package ComponentsClass.Packages;

import ComponentsClass.McUnit.*;
import ComponentsClass.Display.*;
import Builders.*;

public class Premium extends Package {

    public Premium() { 
        Director director = new Director();
        super.mcUnit = director.prepareMcUnit("RaspberryPI");
        super.display = new TouchScreen();
    }
    
    @Override
    public String getPackageName() {
        return "premium";
    }
    @Override
    public String getPackageDisplay() {
        return "touchScreenDisplay";
    }
    @Override
    public McUnit getPackageMcUnit() {
        return super.mcUnit;
    }
    
}
