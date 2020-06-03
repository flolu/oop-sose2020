public class Labor {
  public int plätze;
  public Praktikum[] praktika;
  public Adresse adresse;

  public Labor(int plz, Adresse adr, Praktikum[] prtk) {
    this.plätze = plz;
    this.praktika = prtk;
    this.adresse = adr;
  }

  public int getPlätze() {
    return plätze;
  }

  public int getAdresse() {
    return adresse;
  }

  public int getPraktika() {
    return praktika;
  }
}