package tecProg;

import java.awt.Color;

import robocode.AdvancedRobot;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;

public class PedroHenrique extends AdvancedRobot{

	public void run() {
		this.setColors(Color.pink, Color.green, Color.cyan);
		while(true) {
			this.setAhead(120);
			this.setTurnLeft(90);
			this.setAhead(120);
			this.turnRight(90);
			this.setTurnRadarLeft(360);
			this.setTurnGunLeft(360);
		}
	}
	
	public void onScannedRobot(ScannedRobotEvent event) {
		fireBullet(1.5);
	}
	
	public void onHitWall(HitWallEvent event) {
		this.setBack(150);
	}
	
	public void onHitByBullet(HitByBulletEvent event) {
		this.setTurnLeft(180);
		this.setAhead(120);
	}
	
	public void onHitRobot(HitRobotEvent event) {
		this.setBack(150);
		this.setTurnRight(100);
	}
}
