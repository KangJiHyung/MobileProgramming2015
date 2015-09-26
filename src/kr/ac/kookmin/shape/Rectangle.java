package kr.ac.kookmin.shape;

public class Rectangle extends Shape {
	private int h;
	private int w;
	
	public Rectangle(Point center, int W, int H) {
		this.center=center;
		h=H;
		w=W;
	}
	
	public int getHeight() {
		return h;
	}
	
	public int getWidth() {
		return w;
	}
	
	public Rectangle getBounds() {
		return this;
	}

	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}

	@Override
	public String toString() {
		return "Rectangle";
	}
}