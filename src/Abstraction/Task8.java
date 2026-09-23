package Abstraction;//Write a Java program to create an abstract class Instrument with abstract methods play() and tune().
// Create subclasses for Glockenspiel and Violin that extend the Instrument class and
// implement the respective methods to play and tune each instrument.

abstract class Instrument{
    public abstract void play();
    public abstract void tune();
}

class Glockenspiel extends Instrument {

    @Override
    public void play() {
        System.out.println("Glockenspiel: Playing the notes on the metal bars.");
    }

    @Override
    public void tune() {
        System.out.println("Glockenspiel: Tuning the metal bars to the correct pitch.");
    }
}

class Violin extends Instrument {

    @Override
    public void play() {
        System.out.println("Violin: Playing the strings with a bow or fingers.");
    }

    @Override
    public void tune() {
        System.out.println("Violin: Tuning the strings to the correct pitch.");
    }
}

class Task8 {
    public static void main(String[] args){
        Instrument violin = new Violin();
        Instrument glockenspiel = new Glockenspiel();

        violin.play();
        violin.tune();

        glockenspiel.tune();
        glockenspiel.play();
    }
}