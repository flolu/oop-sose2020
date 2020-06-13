class Auto {
  private String kennzeichen = "J-AA 01";
  private int kilometerstand = 0;
  private ESitzplatz sitzplaetze = ESitzplatz.FUENF;
  private boolean antenneEingefahren = true;

  Auto() {
  }

  Auto(String knz) {
    kennzeichen = knz;
  }

  Auto(ESitzplatz sp) {
    sitzplaetze = sp;
  }

  public String getKennzeichen() {
    return kennzeichen;
  }

  public int getKilometerstand() {
    return kilometerstand;
  }

  public int getSitzplaetze() {
    return sitzplaetze == ESitzplatz.FUENF ? 5 : 2;
  }

  public void fahre(int kilometer) {
    System.out.println("Das Auto ist " + kilometer + " km gefahren");
    kilometerstand += kilometer;
  }

  public void fahreAntenneAus() {
    antenneEingefahren = false;
    System.out.println("Antenne wurde ausgefahren");
  }

  public void fahreAntenneEin() {
    antenneEingefahren = true;
    System.out.println("Antenne wurde eingefahren");
  }

  public void bereiteWaschenVor() {
    fahreAntenneEin();
  }

  public void wasche() {
    bereiteWaschenVor();
    System.out.println("Das Auto wird geschwaschen");
  }

  public String toString() {
    String antennenString = antenneEingefahren ? "eingefahren" : "ausgefahren";
    return "Das Auto mit dem Kennzeichen " + getKennzeichen() + " hat " + getSitzplaetze()
        + " Sitzplaetze und der Kilometerstand ist " + getKilometerstand() + " km. Die Antenne ist" + antennenString
        + ".";
  }
}