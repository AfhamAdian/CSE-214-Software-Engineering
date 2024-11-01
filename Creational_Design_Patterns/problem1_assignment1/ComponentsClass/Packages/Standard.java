package ComponentsClass.Packages;

import ComponentsClass.McUnit.*;
import ComponentsClass.Display.*;
import Builders.*;

public class Standard extends Package {

    public Standard() { 
        Director director = new Director();
        super.mcUnit = director.prepareMcUnit("ArdinoMega");
        super.display = new LED();
    }
    
    @Override
    public String getPackageName() {
        return "standard";
    }
    @Override
    public String getPackageDisplay() {
        return "LED";
    }
    @Override
    public McUnit getPackageMcUnit() {
        return super.mcUnit;
    }
    
}
