package Herrramientas;

import java.util.UUID;

public class GetCodes {

    ///generador de id
    public static String getNewId(String code) {

        return code + "-" + UUID.randomUUID();
    }

}
