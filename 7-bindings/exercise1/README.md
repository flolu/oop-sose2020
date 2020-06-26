| Unterschied [Statische vs Dynamische Bindungen](https://youtu.be/W6s7RZo06nA?t=362)

# Aufgabe 1

## a)

DIe Aufgabe ist komisch... Das sind doch eigentlich alles ungültige Funktionsaufrufe!?

| Aufruf | Methode | Begründung                                                                                              |
| :----: | :-----: | ------------------------------------------------------------------------------------------------------- |
|   1    |    2    | `add` mit zwei Gleitkommazahlen                                                                         |
|   2    |    1    | `add` mit zwei ganzen Zahlen                                                                            |
|   3    |    1    | `add` mit zwei ganzen Zahlen (`L` ist das Suffix fuer `long` und wird automatisch in `int` umgewandelt) |
|   4    |    ?    | ?                                                                                                       |
|   5    |    ?    | ?                                                                                                       |
|   6    |    ?    | ?                                                                                                       |
|   7    |    ?    | ?                                                                                                       |

## b)

| Aufruf |  Ausgabe  | Begründung                                                                                                                                |
| :----: | :-------: | ----------------------------------------------------------------------------------------------------------------------------------------- |
|   1    |     1     | `p1` wurde mit `x=1` initialisiert. die Zuweisung `p1=p2` ändert den Wert von `x (Print1)` nicht                                          |
|   2    |     4     | `p1` ist vom Typ `Print2`. es wird `print` mit `this=Print2` aufgerufen. `c` hat den Basistyp `B`. Also wird `x + 1` = `3 + 1` ausgegeben |
|   3    |     5     | XXX                                                                                                                                       |
|   4    |     4     | XXX                                                                                                                                       |
|   5    |     4     | XXX                                                                                                                                       |
|   6    |     5     | XXX                                                                                                                                       |
|   7    | Exception | XXX                                                                                                                                       |
