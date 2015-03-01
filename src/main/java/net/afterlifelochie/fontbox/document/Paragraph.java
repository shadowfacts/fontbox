package net.afterlifelochie.fontbox.document;

import java.io.IOException;

import net.afterlifelochie.fontbox.api.ITracer;
import net.afterlifelochie.fontbox.document.property.AlignmentMode;
import net.afterlifelochie.fontbox.font.GLFontMetrics;
import net.afterlifelochie.fontbox.layout.LayoutException;
import net.afterlifelochie.fontbox.layout.PageWriter;
import net.afterlifelochie.fontbox.layout.PageCursor;
import net.afterlifelochie.fontbox.layout.components.Page;
import net.afterlifelochie.fontbox.render.BookGUI;

public class Paragraph extends Element {

	public String text;
	public AlignmentMode align;

	/**
	 * Create a new paragraph with a specified text and the default alignment
	 * (justified).
	 * 
	 * @param text
	 *            The text
	 */
	public Paragraph(String text) {
		this(text, AlignmentMode.JUSTIFY);
	}

	/**
	 * Create a new paragraph with the specified properties.
	 * 
	 * @param text
	 *            The text
	 * @param align
	 *            The alignment mode
	 */
	public Paragraph(String text, AlignmentMode align) {
		this.text = text;
		this.align = align;
	}

	@Override
	public void layout(ITracer trace, PageWriter writer) throws IOException, LayoutException {
		Page page = writer.current();
		boxText(trace, writer, page.properties.bodyFont, text, AlignmentMode.JUSTIFY);
		writer.cursor().pushDown(10);
	}

	@Override
	public boolean canUpdate() {
		return false;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(BookGUI gui, int mx, int my, float frame) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clicked(BookGUI gui, int mx, int my) {
		// TODO Auto-generated method stub

	}

	@Override
	public void typed(BookGUI gui, char val, int code) {
		// TODO Auto-generated method stub

	}

}
