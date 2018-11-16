package io.scalecube.cluster.leaderelection;

public class Config {

	private int heartbeatInterval = 200;
	private int timeout = 800;
	private long consensusTimeout = 3;

	public Config() {
	}

	public int timeout() {
		return timeout;
	}

	public int heartbeatInterval() {
		return heartbeatInterval;
	}

	public long consensusTimeout() {
		return consensusTimeout;
	}
}
