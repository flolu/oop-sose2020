public class Einwohner {
  protected double steuer_faktor = 0.1;
  protected int einkommen;
  protected int mindestAbgabe = 1;

  int zuVersteuerndesEinkommen() {
    return this.einkommen;
  }

  int steuer() {
    int abgabe = (int) Math.floor(this.zuVersteuerndesEinkommen() * this.steuer_faktor);
    return abgabe > this.mindestAbgabe ? abgabe : this.mindestAbgabe;
  }

  void setEinkommen(int einkommen) {
    this.einkommen = einkommen;
  }
}