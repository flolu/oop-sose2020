public class Hörsaal {
  public int plätze;
  public Vorlesung[] vorlesungen;
  public Adresse adresse;

  public Hörsaal(int plz, Adresse adr, Vorlesung[] vlg) {
    this.plätze = plz;
    this.vorlesungen = vlg;
    this.adresse = adr;
  }

  public int getPlätze() {
    return plätze;
  }

  public int getAdresse() {
    return adresse;
  }

  public int getVorlesungen() {
    return vorlesungen;
  }
}