package ro.pub.cs.systems.eim.practicaltest01;

public interface Constants {
    final public static String STUFF = "ro.pub.cs.systems.eim.practicaltest01.stuff";
    final public static int SECONDARY_ACTIVITY_REQUEST_CODE = 2023;
    final public static String DATA = "ro.pub.cs.systems.eim.practicaltest01.data";

    final public static String DATA2 = "ro.pub.cs.systems.eim.practicaltest01.data2";
    final public static String DATA3 = "ro.pub.cs.systems.eim.practicaltest01.data3";

    final public static String[] actionTypes = {
            "ro.pub.cs.systems.eim.practicaltest01.arithmeticmean",
            "ro.pub.cs.systems.eim.practicaltest01.geometricmean"
    };

    final public static int SERVICE_STOPPED = 0;
    final public static int SERVICE_STARTED = 1;

    final public static String FIRST_NUMBER = "ro.pub.cs.systems.eim.practicaltest01.first_number";
    final public static String SECOND_NUMBER = "ro.pub.cs.systems.eim.practicaltest01.second_number";

    final public static String PROCESSING_THREAD_TAG = "[Processing Thread]";

    final public static String BROADCAST_RECEIVER_EXTRA = "message";
    final public static String BROADCAST_RECEIVER_TAG = "[Message]";
}
