public class Einwohner {
  protected double steuerFaktor = 0.1;
  protected int einkommen;
  protected int mindestAbgabe = 1;

  int zuVersteuerndesEinkommen() {
    return this.einkommen;
  }

  int steuer() {
    int abgabe = (int) Math.floor(this.zuVersteuerndesEinkommen() * this.steuerFaktor);
    return abgabe > this.mindestAbgabe ? abgabe : this.mindestAbgabe;
  }

  void setEinkommen(int einkommen) {
    this.einkommen = einkommen;
  }
}