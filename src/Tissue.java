import java.util.ArrayList;

public abstract class Tissue {
    public HumanObjectProperty tissueType; // 0 = Connective, 1 = Muscle, 2 = Nervous, 3 = Epithelial
    public ArrayList<HumanObjectProperty> properties = new ArrayList<HumanObjectProperty>();

    public Tissue(){

    }

    public Tissue(HumanObjectProperty tissueType){
        this.tissueType = tissueType;
    }

    public HumanObjectProperty getType(){
        return tissueType;
    }
}
