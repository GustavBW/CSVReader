public enum Type {
    INT8,
    INT16,
    INT32,
    INT64,
    FLOAT32,
    FLOAT64,
    STRING,
    DATE,
    INSTANT,
    NULL,
    UNKNOWN;

    public static Type of(Class<?> clazz){
        if(clazz == null) return NULL;
        return switch (clazz.toString()){
            case "byte", "class java.lang.Byte" -> Type.INT8;
            case "short", "class java.lang.Short" -> Type.INT16;
            case "int", "class java.lang.Integer" -> Type.INT32;
            case "long", "class java.lang.Long" -> Type.INT64;
            case "float", "class java.lang.Float" -> Type.FLOAT32;
            case "double", "class java.lang.Double" -> Type.FLOAT64;
            case "String", "class java.lang.String" -> Type.STRING;
            case "Date", "class java.util.Date" -> Type.DATE;
            case "Instant", "class java.time.Instant" -> Type.INSTANT;
            default -> Type.UNKNOWN;
        };
    }
}
