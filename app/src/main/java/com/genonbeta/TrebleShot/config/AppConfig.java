package com.genonbeta.TrebleShot.config;

public class AppConfig
{
	public final static int COMMUNICATION_SERVER_PORT = 1128;
	public final static int SEAMLESS_SERVER_PORT = 58762;
	public final static int COMPATIBLE_UPDATE_CHANNEL_PORT = 58765;
	public final static byte[] DEFAULT_BUFFER_SIZE = new byte[8096];
	public final static byte[] SMALL_BUFFER_SIZE = new byte[1024];
	public final static int DEFAULT_SOCKET_TIMEOUT = 5000;
	public final static int DEFAULT_SOCKET_LARGE_TIMEOUT = 40000;
	public final static int SUPPORTED_MIN_VERSION = 55;
	public final static String[] DEFAULT_DISABLED_INTERFACES = new String[]{"rmnet"};
	public final static String APP_UPDATE_REPO = "https://api.github.com/repos/genonbeta/TrebleShot/releases";
	public final static String APPLICATION_REPO = "http://github.com/genonbeta/TrebleShot";
	public final static String DEFAULT_NOTIFICATION_CHANNEL = "defNotChannel";
	public final static String ACCESS_POINT_PREFIX = "TS_";
	public final static String NETWORK_INTERFACE_WIFI = "wlan0";

}
