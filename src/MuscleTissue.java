public class MuscleTissue extends Tissue {
    public HumanObjectProperty muscleType;
    public MuscleTissue(HumanObjectProperty muscleType){
        super(HumanObjectProperty.muscleTissue);
        this.muscleType = muscleType;
    }

    public HumanObjectProperty getType(){
        return muscleType;
    }
}
