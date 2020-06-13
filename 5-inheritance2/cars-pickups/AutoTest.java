import java.util.ArrayList;

class AutoTest {
  ArrayList<Auto> list = new ArrayList<Auto>();

  AutoTest() {
    list.add(new Auto());
    list.add(new Auto(ESitzplatz.ZWEI));
    list.add(new Auto("X-YZ-42"));
    list.add(new PickUp(777));
    list.add(new PickUp(1234));

    printList();

    Auto a1 = list.get(0);
    a1.fahre(100);
    a1.fahreAntenneEin();

    Auto a2 = list.get(1);
    a2.fahre(200);
    a2.fahreAntenneAus();

    Auto a3 = list.get(2);
    a3.fahre(300);
    a3.wasche();

    PickUp p1 = (PickUp) list.get(3);
    p1.fahre(400);
    p1.beladen(500);
    p1.entladen(100);
    p1.bereiteWaschenVor();

    PickUp p2 = (PickUp) list.get(4);
    p2.fahre(600);
    p2.beladen(700);
    p2.entladen();

    printList();
  }

  private void printList() {
    for (Auto auto : list) {
      System.out.println(auto.toString());
    }
  }
}