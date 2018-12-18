package Factory;

import GIS.Map;
import Geom.Point3D;

public class MapFactory
{
    public static Map ArielMap()
    {
        return new Map(new Point3D( 32.106046, 35.202574) , new Point3D(32.101858,   35.212405) , "Ariel1.png");
    }
}