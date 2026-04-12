/**
 * Repräsentiert einen Punkt oder Vektor im 2D-Raum.
 *
 * <p>Ein {@code Vertex} besitzt zwei Koordinaten {@code x} und {@code y} (als {@code double}).
 * Er wird in der gesamten Spielframework-Bibliothek als universeller 2D-Vektor verwendet –
 * sowohl für Positionen ({@code pos}) als auch für Bewegungsrichtungen ({@code deltaPos}).</p>
 *
 * <p>Im Buch <em>"Java will nur spielen"</em> von Sven Eric Panitz ist {@code Vertex}
 * die fundamentale Klasse, auf der alle geometrischen Objekte aufbauen.</p>
 *
 * @author Sven Eric Panitz / hibbes (Adaptierung)
 * @see GeometricObject
 */
public class Vertex {

    /** X-Koordinate (horizontal, wächst nach rechts). */
    public double x;

    /** Y-Koordinate (vertikal, wächst nach unten – Bildschirmkoordinaten). */
    public double y;

    /**
     * Erstellt einen Vektor/Punkt an den angegebenen Koordinaten.
     *
     * @param x X-Koordinate
     * @param y Y-Koordinate
     */
    public Vertex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return {@code "(x,y)"} – lesbare Darstellung des Punktes
     */
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    /**
     * Berechnet die Länge (den Betrag) dieses Vektors.
     *
     * <p>Formel: |v| = √(x² + y²) (Satz des Pythagoras)</p>
     *
     * @return euklidische Länge des Vektors
     */
    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    /**
     * Multipliziert diesen Vektor mit einem Skalar (in-place, verändert das Objekt).
     *
     * <p>Nützlich z. B. um eine Geschwindigkeit zu skalieren: {@code v.skalarMod(2.0)}
     * verdoppelt die Geschwindigkeit.</p>
     *
     * @param s Skalierungsfaktor
     */
    public void skalarMod(double s) {
        this.x = x * s;
        this.y = y * s;
    }

    /**
     * Gibt einen neuen, skalierten Vektor zurück (unveränderlich, Originalbleibt).
     *
     * @param s Skalierungsfaktor
     * @return neuer Vertex mit (x*s, y*s)
     */
    public Vertex skalarMultMod(double s) {
        return new Vertex(x * s, y * s);
    }

    /**
     * Addiert zwei Vektoren und gibt das Ergebnis als neuen Vertex zurück.
     *
     * <p>Wird für Bewegung verwendet: {@code pos.add(deltaPos)} ergibt die neue Position.</p>
     *
     * @param v2 zweiter Summand
     * @return neuer Vertex (x + v2.x, y + v2.y)
     */
    public Vertex add(Vertex v2) {
        return new Vertex(x + v2.x, y + v2.y);
    }

    /**
     * Addiert einen Vektor in-place (modifiziert diesen Vertex).
     *
     * <p>Beide Komponenten werden addiert. (Frühere Version hatte einen
     * Bug: nur die x-Komponente wurde aktualisiert.)</p>
     *
     * @param v2 zu addierender Vektor
     */
    public void addMod(Vertex v2) {
        this.x = x + v2.x;
        this.y = y + v2.y;
    }

    /** @return X-Koordinate */
    public double getX() { return x; }

    /** @return Y-Koordinate */
    public double getY() { return y; }

    /** @param x neue X-Koordinate */
    public void setX(double x) { this.x = x; }

    /** @param y neue Y-Koordinate */
    public void setY(double y) { this.y = y; }

    /**
     * Prüft Gleichheit zweier Vertices.
     *
     * @param thatObject Vergleichsobjekt
     * @return {@code true} wenn beide Koordinaten gleich sind
     */
    @Override
    public boolean equals(Object thatObject) {
        if (thatObject instanceof Vertex) {
            Vertex that = (Vertex) thatObject;
            return this.x == that.x && this.y == that.y;
        }
        return false;
    }
}
