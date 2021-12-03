public class BubbleSort extends Sort {

    public BubbleSort(String fileName) {
        super(fileName);
    }

    @Override
    public void sort() {
        for (int i = 0; i < samples.size()-1; i++) {
            for (int j = 0; j < samples.size()-i-1; j++) {
                if (samples.get(j).measurement < samples.get(j+1).measurement) {
                    double temp = samples.get(j).measurement;
                    int tempID = samples.get(j).id;
                    samples.get(j).measurement = samples.get(j + 1).measurement;
                    samples.get(j + 1).measurement = temp;
                    samples.get(j).id = samples.get(j + 1).id;
                    samples.get(j + 1).id = tempID;
                }
            }
        }
    }

}
