package client;

import Utilities.Config;

public class StartTerminals {
	public static void main(String[] argv) {
		new LibClient(Config.DEFAULT_HOST, Config.DEFAULT_PORT);
	}
}
