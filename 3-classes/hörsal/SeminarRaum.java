public class SeminarRaum {
  public int plätze;
  public Übung[] übungen;
  public Adresse adresse;

  public SeminarRaum(int plz, Adresse adr, Übung[] übg) {
    this.plätze = plz;
    this.übungen = übg;
    this.adresse = adr;
  }

  public int getPlätze() {
    return plätze;
  }

  public int getAdresse() {
    return adresse;
  }

  public int getÜbungen() {
    return übungen;
  }
}