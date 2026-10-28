import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;

public class Aquarium {

	public void drawBackground(PainterAPI painter, int canvasWidth, int canvasHeight) {
		//Splits the canvas into 6 sections, each with a different color
	}

	public void drawSun(PainterAPI painter, int x, int y, int radius) {
		//Draws a sun at the specified coordinates with the given radius
	}

	public void drawCloud(PainterAPI painter, int x, int y) {
		//Draws a cloud at the specified coordinates
	}

	public void drawBuilding(PainterAPI painter, int x, int y) {
		//Draws a building at the specified coordinates with random width and height
	}

	public void drawStar(PainterAPI painter, int x, int y) {
		//Draws a star at the specified coordinates
	}
	public static void main(String[] args) {
		CanvasAPI canvas = Graphics.createCanvas(800, 600, "Placeholder Canvas");

		PainterAPI painter = canvas.getPainter();
		painter.setSpeed(10);
		painter.forward(100);
	}
}