package pattern.builder;

public class BuilderPattern {
    public static void main(String[] args) {
//        ArrayList<String> sequence = new ArrayList<String>();
//        sequence.add("engine boom"); //客户要求，run的时候先发动引擎
//        sequence.add("start"); //启动起来
//        sequence.add("stop"); //开了一段就停下来
//
//        BenzModel benz = new BenzModel();
//        benz.setSequence(sequence);
//        benz.run();
//
//        BMWModel bmw = new BMWModel();
//        bmw.setSequence(sequence);
//        bmw.run();

        Designer designer = new Designer();
        BenzModel aModel = (BenzModel) designer.getAModel(new BenzBuilder());
        aModel.run();
    }
}
