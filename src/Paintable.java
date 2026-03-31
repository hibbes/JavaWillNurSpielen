/**
 * Interface für alle Objekte, die sich auf eine {@link java.awt.Graphics}-Fläche
 * zeichnen können.
 *
 * <p><b>Design-Prinzip (Interface):</b><br>
 * Ein Interface definiert einen Vertrag: Jede Klasse, die {@code Paintable}
 * implementiert, verspricht, eine {@code paintTo}-Methode anzubieten.
 * Das ermöglicht es, unterschiedliche Objekte (Ovale, Rechtecke, Bilder, …)
 * mit demselben Aufruf zu zeichnen – ohne zu wissen, was genau gezeichnet wird.</p>
 *
 * <p><b>Verwendung:</b>
 * <pre>
 *   List&lt;Paintable&gt; objekte = new ArrayList&lt;&gt;();
 *   objekte.add(new SimpleOval(...));
 *   objekte.add(new PaintableImage(...));
 *   // Alle zeichnen, ohne den konkreten Typ zu kennen:
 *   for (Paintable p : objekte) p.paintTo(graphics);
 * </pre></p>
 *
 * @author Sven Eric Panitz / hibbes (Adaptierung)
 * @see GameObject
 */
public interface Paintable {

    /**
     * Zeichnet dieses Objekt auf die angegebene Zeichenfläche.
     *
     * @param g das {@link java.awt.Graphics}-Objekt des Panels oder Fensters
     */
    void paintTo(java.awt.Graphics g);
}
