package net.edge.activity;

import net.edge.Client;
import net.edge.Constants;
import net.edge.cache.CacheArchive;
import net.edge.game.model.Model;
import net.edge.media.font.BitmapFont;
import net.edge.media.tex.Texture;
import net.edge.od.OnDemandFetcher;

/**
 * An <i>Activity</i> is a handler for a stage of the client.
 * @author Rob Bubletan
 * @see TitleActivity
 * @see GameActivity
 */
public abstract class Activity {

	/**
	 * Instance to access the client.
	 */
	public static Client client;

	/*
	 * Bit map fonts.
	 */
	protected static BitmapFont smallFont;
	protected static BitmapFont plainFont;
	protected static BitmapFont boldFont;
	protected static BitmapFont fancyFont;

	/**
	 * This method will create the access to the fields of the client.
	 */
	public static void init() {
		smallFont = client.smallFont;
		plainFont = client.plainFont;
		boldFont = client.boldFont;
		fancyFont = client.fancyFont;
	}

	/**
	 * This method will return the nodeId <code>String</code>.
	 * <br>Example: <code>return "game";</code>
	 */
	public abstract String id();

	/**
	 * This will process the actions e.g. clicking and writing.
	 * @return {@code true} if process has been made, {@code false} otherwise.
	 */
	public abstract boolean process();

	/**
	 * This method will process the updating of the graphics.
	 */
	public abstract void update();

	/**
	 * This initializes the activity.
	 */
	public abstract void initialize();

	/**
	 * This method cleans all the data that is no longer needed.
	 * {@link #initialize() initialize} will undo the changes.
	 */
	public abstract void reset();
}
