class PickUp extends Auto {
  private int ladung = 0;
  private int f;

  int getLadung() {
    return ladung;
  }

  PickUp(int fassungsvermoegen) {
    super(ESitzplatz.ZWEI);
    f = fassungsvermoegen;
  }

  boolean beladen(int ldg) {
    if (ladung + ldg > f)
      return false;
    ladung += ldg;
    System.out.println("Du hast " + ldg + " Liter auf den PickUp geladen");
    return true;
  }

  void entladen(int ldg) {
    if (ldg > ladung)
      throw new Error("Du hast nur " + ladung + " Liter auf dem PickUp");
    ladung -= ldg;
    System.out.println("Du hast " + ldg + " Liter vom PickUp geladen");
  }

  void entladen() {
    entladen(ladung);
  }

  public void bereiteWaschenVor() {
    super.bereiteWaschenVor();
    entladen();
  }

  public String toString() {
    return super.toString() + " Der PickUp hat eine Ladefleache von " + f + " Liter und momentan sind " + ladung
        + " Liter aufgeladen.";
  }
}