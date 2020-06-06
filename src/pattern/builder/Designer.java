package pattern.builder;

import java.util.ArrayList;

public class Designer {

    private ArrayList<String> sequence = new ArrayList();

    public CarModel getAModel(CarBuilder builder) {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        builder.setSequence(this.sequence);
        return builder.getCarModel();
    }

    public CarModel getBModel(CarBuilder builder) {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        builder.setSequence(this.sequence);
        return builder.getCarModel();
    }

}
