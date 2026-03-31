/**
 * Zentrales Interface für alle Spielobjekte: kombiniert Zeichnen ({@link Paintable})
 * und Bewegen ({@link Movable}).
 *
 * <p>Ein {@code GameObject} ist das vollständige Interface für ein Objekt, das im
 * Spiel erscheint: Es kann gezeichnet werden, hat eine Position und Größe, kann sich
 * bewegen und mit anderen Objekten interagieren (Kollisionserkennung).</p>
 *
 * <p><b>Interface-Vererbung:</b><br>
 * {@code GameObject extends Paintable, Movable} bedeutet: Ein {@code GameObject}
 * muss alle Methoden von {@code Paintable} <em>und</em> von {@code Movable}
 * implementieren. Das ist Interface-Mehrfachvererbung – in Java nur für Interfaces
 * erlaubt (nicht für Klassen).</p>
 *
 * @author Sven Eric Panitz / hibbes (Adaptierung)
 * @see Paintable
 * @see Movable
 * @see GeometricObject
 */
public interface GameObject extends Paintable, Movable {

    /** @return Breite des Objekts */
    double getWidth();

    /** @return Höhe des Objekts */
    double getHeight();

    /** @return aktuelle Position (linke obere Ecke) als {@link Vertex} */
    Vertex getPos();

    /** @return aktueller Bewegungsvektor (Geschwindigkeit + Richtung) */
    Vertex getDeltaPos();

    /** @param v neuer Bewegungsvektor */
    void setDeltaPos(Vertex v);

    /**
     * Prüft, ob dieses Objekt größer als {@code that} ist (nach Fläche).
     *
     * @param that Vergleichsobjekt
     * @return {@code true} wenn Fläche dieses Objekts größer ist
     */
    boolean isLargerThan(GameObject that);

    /**
     * Prüft, ob dieses Objekt sich links von {@code that} befindet.
     *
     * @param that Vergleichsobjekt
     * @return {@code true} wenn die rechte Kante dieses Objekts links vom linken Rand von {@code that} ist
     */
    boolean isLeftOf(GameObject that);

    /**
     * Prüft, ob dieses Objekt sich oberhalb von {@code that} befindet.
     *
     * @param that Vergleichsobjekt
     * @return {@code true} wenn die untere Kante dieses Objekts über dem oberen Rand von {@code that} ist
     */
    boolean isAbove(GameObject that);

    /**
     * Prüft, ob dieses Objekt {@code that} berührt (Kollisionserkennung).
     *
     * @param that Vergleichsobjekt
     * @return {@code true} wenn die Bounding Boxes beider Objekte sich überschneiden
     */
    boolean touches(GameObject that);
}
