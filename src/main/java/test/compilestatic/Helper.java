package test.compilestatic;

import java.util.Date;
import java.util.UUID;

public class Helper {

    public static String createId() {
        return "id";
    }

    public static Date createDate() {
        return new Date();
    }

    public static UUID createUuid() {
        return UUID.randomUUID();
    }
}
