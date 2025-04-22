public class ConvertingUnits {
    public double[] convertTemperature(double celsius) {
        double[] answers = new double[2];

        answers[0] = celsius + 273.15;
        answers[1] = (celsius * 1.8) + 32;


        return answers;

    }
}
