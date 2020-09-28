public class Studerende {
    // TODO Nu skal I selv bygge en klasse, som kan repræsentere en studerende med navn, alder, by, studieretning.
    // TODO Herefter skal i instatiere "studerende-objekter" for hver studerende i Jeres gruppe .
    // TODO Til sidst skal I lave en switch sætning, som indlæser et navn, og som kan vise den given studerendes alder.

    String navn;
    int alder;
    String by;
    String studieretning;
    String campus;

    Studerende() {
        System.out.println("Et nyt objekt er instansieret af typen Studerende");
        studieretning = "Datamatiker";
        campus = "Næstved";
    }
    Studerende(String x, int y, String z) {
        this.navn = x;
        this.alder = y;
        this.by = z;
    }

    public Studerende(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }


}