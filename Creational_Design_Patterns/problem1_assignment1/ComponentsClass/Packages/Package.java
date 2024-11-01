package ComponentsClass.Packages;

import ComponentsClass.McUnit.McUnit;
import ComponentsClass.Display.Display;

public abstract class Package {
    McUnit mcUnit = null;
    Display display = null;
    
    abstract public String getPackageName();
    abstract public String getPackageDisplay();
    abstract public McUnit getPackageMcUnit();

    @Override
    public String toString() {
        System.out.println("    Package Name : " + getPackageName());
        System.out.println("    Display : " + getPackageDisplay());
        System.out.println("    McUnit : ");
        System.out.println(mcUnit);
        return "";
    }
}