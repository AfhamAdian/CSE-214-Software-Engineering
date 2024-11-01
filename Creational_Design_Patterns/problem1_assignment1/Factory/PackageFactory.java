package Factory;

import ComponentsClass.Packages.Basic;
import ComponentsClass.Packages.Standard;
import ComponentsClass.Packages.Advanced;
import ComponentsClass.Packages.Premium;
import ComponentsClass.Packages.Package;

public class PackageFactory  {
    
    public Package createPackage(String packageName) {
        if(packageName == null) {
            return null;
        }

        switch (packageName.toLowerCase()) {
            case "basic":
                return new Basic();
            case "standard":
                return new Standard();
            case "advanced":
                return new Advanced();
            case "premium":
                return new Premium();
            default:
                return null;
        }
    }
}