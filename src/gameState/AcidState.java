package gameState;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import handlers.Keys;

public class AcidState extends GameState {
	private BufferedImage image;
	
	public AcidState(GameStateManager gsm) {
		super(gsm);
		try {
			image = ImageIO.read(
			getClass().getResourceAsStream(
			"/inout/tro/intro.gif"
			)).getSubimage(0, 0, 540, 390); //0 0 40 40
		}
		catch(Exception e) {}
	}
	
	public void init() {}
	
	public void update() {
		handleInput();
	}
	
	public void draw(Graphics2D g) {
		g.drawImage(image, null, 0, 0);
	}
	
	public void handleInput() {
		if(Keys.isPressed(Keys.ENTER)) gsm.setState(GameStateManager.MENUSTATE);
	}
}
