package entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import main.Game;

public class Player extends Entity{
	
	public boolean right,left;
	public double speed = 1;
	
	private int frames  = 0;
	private BufferedImage[] rightPlayer, leftPlayer;

	public Player(int x, int y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);
		
		rightPlayer = new BufferedImage[4];
		leftPlayer = new BufferedImage[4];
		for(int i = 0; i < 4; i++) {
			rightPlayer[i] = Game.spritesheet.getSprit(0 + (i*16), 0, 16, 24, "/playerRight.png");
			leftPlayer[i] = Game.spritesheet.getSprit(0 + (i*16), 0, 16, 24, "/playerLeft.png");
		}
	}
	
	public void tick() {
		if(right) {
			x += speed;
		} else if(left) {
			x -= speed;
		}
	}
	
	public void render(Graphics g) {
		if(right) {
			g.drawImage(rightPlayer[0], this.getX(), this.getY(), null);
		}else if(left) {
			g.drawImage(leftPlayer[0], this.getX(), this.getY(), null);
		}
	}

}
