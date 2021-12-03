public class InsertionSort extends Sort {

    public InsertionSort(String fileName) {
        super(fileName);
    }

    @Override
    public void sort() {
        int i;
        int j;
        double temp;
        int tempID;

        for (i = 1; i < samples.size(); i++) {
            j = i;
            while (j > 0 && samples.get(j).measurement > samples.get(j-1).measurement) {
                temp = samples.get(j).measurement;
                tempID  = samples.get(j).id;
                samples.get(j).measurement = samples.get(j-1).measurement;
                samples.get(j-1).measurement = temp;
                samples.get(j).id = samples.get(j-1).id;
                samples.get(j-1).id = tempID;
                j--;
            }
        }
    }

}
