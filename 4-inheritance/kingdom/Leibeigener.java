public class Leibeigener extends Bauer {
  int zuVersteuerndesEinkommen() {
    return this.einkommen > 12 ? this.einkommen - 12 : 12;
  }
}