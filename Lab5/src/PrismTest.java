public class PrismTest {
    private Prism[] prisms;


    public Prism[] getPrisms() {
        return prisms;
    }

    public void setPrisms(Prism[] prisms) {
        this.prisms = prisms;
    }

    public PrismTest() {
    }

    public PrismTest(Prism[] prisms) {
        this.prisms = prisms;
    }

    public String getMaxDiagonal() {
        int maxIndex = 0;
        for (int i = 0; i < prisms.length - 1; i++) {
            if (prisms[maxIndex].getDiagonal() < prisms[i + 1].getDiagonal()) {
                maxIndex = i + 1;
            }
        }
        return "The prism with maximum diagonal is " + maxIndex + ". It's diagonal is " + prisms[maxIndex].getDiagonal() + "." + "\nAbout " + prisms[maxIndex].toString();

    }
}

