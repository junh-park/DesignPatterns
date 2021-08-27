package com.jun.creational.builder;

import javax.management.monitor.Monitor;

class Computer {
	private GraphicsCard graphicsCard;
	private Monitor[] monitors;
	private Processor processor;
	private Memory[] ram;

	public Computer(Builder builder) {
		this.graphicsCard = builder.graphicsCard;
	}

	public GraphicsCard getGraphicsCard() {
		return graphicsCard;
	}

	public Monitor[] getMonitors() {
		return monitors;
	}

	public Processor getProcessor() {
		return processor;
	}

	public Memory[] getRam() {
		return ram;
	}

	public static class Builder {

		private GraphicsCard graphicsCard;
		private Monitor[] monitors;
		private Processor processor;
		private Memory[] ram;

		public Builder(Processor p) {
			this.processor = p;
		}

		public Builder graphicsCard(GraphicsCard g) {
			this.graphicsCard = g;
			return this;
		}

		public Builder monitors(Monitor[] mg) {
			this.monitors = mg;
			return this;
		}

		public Builder ram(Memory[] ram) {
			this.ram = ram;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}
	}
}

public class ComputerExample {
	public static void main(String[] args) {
		Computer headlessComputer = new Computer.Builder(new Processor()).graphicsCard(new GraphicsCard()).build();
		Memory[] ram = { new Memory(), new Memory(), new Memory(), new Memory() };
		Computer gamingPC = new Computer.Builder(new Processor())
				.ram(new Memory[] { new Memory(), new Memory(), new Memory(), new Memory() }).build();
	}
}
