# JavaWillNurSpielen

Implementierung der Basisklassen aus dem Lehrbuch:

> **Sven Eric Panitz**: *Java will nur spielen – Programmieren lernen mit Spaß und Kreativität*, 2. Aufl., Vieweg+Teubner 2011

## Zweck

Dieses Repo enthält die wichtigsten Framework-Klassen aus dem Buch – als Grundlage für eigene Spielprojekte im Unterricht.

## Klassenhierarchie

```
Interfaces:
  Paintable          ← paintTo(Graphics g)
  Movable            ← move(), getPos(), getDeltaPos(), ...
  GameObject         ← extends Paintable, Movable

Basisklassen:
  Vertex             ← 2D-Punkt/Vektor (x, y)
  GeometricObject    ← Position, Größe, Farbe, Kollision

Konkrete Formen:
  SimpleOval         ← Ellipse (area = π·w·h/4)
  SimpleRectangle    ← Rechteck
  SimpleTriangle     ← Dreieck
  SimpleStar         ← Stern
  PaintableOval      ← Oval das sich selbst malt
  PaintableRectangle ← Rechteck das sich selbst malt
  PaintableStar      ← Stern der sich selbst malt
  MovablePanel       ← Panel mit Spielschleife
  PaintablePanel     ← Panel mit Zeichenlogik
```

## Zentrale Konzepte

- **Interfaces** (`Paintable`, `Movable`, `GameObject`): definieren Verträge
- **Vererbung**: `SimpleOval extends GeometricObject implements Paintable`
- **Komposition**: `MovablePanel` enthält eine Liste von `GameObject`-Instanzen
- **Polymorphismus**: `List<Paintable>` kann Objekte jeder Form enthalten

## Verwandte Repos

- **`zock_reference`** – vollständige Referenzimplementierung mit Packages (name.czernohous.zock_2016)
- **`JWNS26`** – aktuellste Version (2026), weitere Formen ergänzt
