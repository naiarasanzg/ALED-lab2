package es.upm.aled.lab2.kinematics;

import java.util.ArrayList;
import java.util.List;

public class Segment {
	private double length;
	private double angle;
	private List<Segment> children;
	
	public Segment(double length, double angle) {
		this.length=length;
		this.angle=angle;
		this.children = new ArrayList<>();
	}
	public double getLength() {
		return this.length;
	}
	public double getAngle() {
		return this.angle;
	}
	public void setAngle(double angle) {
		this.angle=angle;
	}
	public List<Segment> getChildren(){
		return this.children;
	}
	public void addChild(Segment child) {
		if(!children.contains(child)) {
			children.add(child);
		}
	}
}
