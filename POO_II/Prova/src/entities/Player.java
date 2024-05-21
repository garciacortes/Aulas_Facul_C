package entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import main.Game;

public class Player extends Entity{
	
	public boolean right,left;
	public int right_dir = 0, left_dir = 1;
	public int dir = right_dir;
	public double speed = 1;
	
	private int framesIdle = 0, maxFrames = 5, indexIdle = 0, maxIndexIdle = 3;
	private boolean moved = false, idle = true;
	private BufferedImage[] rightPlayer, leftPlayer;

	public Player(int x, int y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);
		
		rightPlayer = new BufferedImage[4];
		leftPlayer = new BufferedImage[4];
		for(int i = 0; i < 4; i++) {
			rightPlayer[i] = Game.spritesheet.getSprit(0 + (i*16), 0, 16, 24, "/PlayerRight.png");
			leftPlayer[i] = Game.spritesheet.getSprit(0 + (i*16), 0, 16, 24, "/PlayerLeft.png");
		}
	}
	
	public void tick() {
		idle = true;
		moved = false;
		if(right) {
			moved = true;
			idle = false;
			indexIdle = 0;
			dir = right_dir;
			x += speed;
		} else if(left) {
			moved = true;
			idle = false;
			indexIdle = 0;
			dir = left_dir;
			x -= speed;
		}
		
		if(idle) {
			framesIdle++;
			if(framesIdle == maxFrames) {
				framesIdle = 0;
				indexIdle++;
				if(indexIdle > maxIndexIdle) {
					indexIdle = 0;
				}
			}
		}
	}
	
	public void render(Graphics g) {
		if(dir == right_dir) {
			g.drawImage(rightPlayer[indexIdle], this.getX(), this.getY(), null);
		} else if(dir == left_dir) {
			g.drawImage(leftPlayer[indexIdle], this.getX(), this.getY(), null);
		}
	}

}
