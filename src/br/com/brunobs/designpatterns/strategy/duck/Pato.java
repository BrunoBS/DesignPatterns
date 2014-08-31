package br.com.brunobs.designpatterns.strategy.duck;

public abstract class Pato {

	private VoaBehavior voaBehavior;
	private GrasnarBehavior grasnarBehavior;

	public abstract void display();

	public final void voa() {
		voaBehavior.fly();
	}

	public final void grasna() {
		grasnarBehavior.quack();
	}

	public void swim() {
		System.out.println("Todos os patos flutuam, e nadam...");
	}

	public void setVoaBehavior(VoaBehavior voaBehavior) {
		this.voaBehavior = voaBehavior;
	}

	public void setGrasnarBehavior(GrasnarBehavior grasnarBehavior) {
		this.grasnarBehavior = grasnarBehavior;
	}

}
