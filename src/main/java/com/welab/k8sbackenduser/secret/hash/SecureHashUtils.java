package com.welab.k8sbackenduser.secret.hash;

public class SecureHashUtils {

    public static String hash(String password) {
        // TODO: message -> SHA-1 또는 SHA-256 해시 값으로 반환

        return password;
    }

    public static boolean matches(String password, String hashedPassword) {
        String hashed = hash(password);

        return hashed.equals(hashedPassword);
    }
}
