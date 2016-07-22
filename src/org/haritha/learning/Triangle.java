package org.haritha.learning;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements InitializingBean,DisposableBean{
	/*private List<Point> points;
	public List<Point> getPoints() {
		return points;
	}
   public void setPoints(List<Point> points) {
		this.points = points;
	}


*/
private Point pointA;
private Point pointB;
private Point pointC;
private ApplicationContext context=null;

	public Point getPointA() {
	return pointA;
}
public void setPointA(Point pointA) {
	this.pointA = pointA;
}
public Point getPointB() {
	return pointB;
}
public void setPointB(Point pointB) {
	this.pointB = pointB;
}
public Point getPointC() {
	return pointC;
}
public void setPointC(Point pointC) {
	this.pointC = pointC;
}
	public void draw(){
		System.out.println("Point A=("+getPointA().getX()+", "+getPointA().getY()+")");
		System.out.println("Point B=("+getPointB().getX()+", "+getPointB().getY()+")");
		System.out.println("Point C=("+getPointC().getX()+", "+getPointC().getY()+")");
		
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method called for Triangle");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean destroy method called for Triangle");
		
	}
	public void myInit(){
		System.out.println("My init method called for triangle");
	}
	public void cleanUp(){
		System.out.println("My Cleanup method called for triangle");
	}
	
}
