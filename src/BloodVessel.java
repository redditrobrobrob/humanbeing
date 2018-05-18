import java.util.ArrayList;

public abstract class BloodVessel extends Vessel implements HumanObjectInterface {
    double flow; // in mL/s
    double currentDiameter; // in mm
    double standardDiameter; // in mm
    double pressure; // in mm Hg

    public double getFlow() {
        return flow;
    }

    public double getCurrentDiameter() {
        return currentDiameter;
    }

    public double getPressure() {
        return pressure;
    }

    @Override
    public ArrayList<HumanTissueType> getTissues() {
        return null;
    }
}
