package ComponentsClass.Packages;

import ComponentsClass.McUnit.*;
import ComponentsClass.Display.*;
import Builders.*;

public class Basic extends Package {

    public Basic() { 
        Director director = new Director();
        super.mcUnit = director.prepareMcUnit("ATMega32");
        super.display = new LCD();
    }

    @Override
    public String getPackageName() {
        return "basic";
    }
    @Override
    public String getPackageDisplay() {
        return "LCD";
    }
    @Override
    public McUnit getPackageMcUnit() {
        return super.mcUnit;
    }
}
