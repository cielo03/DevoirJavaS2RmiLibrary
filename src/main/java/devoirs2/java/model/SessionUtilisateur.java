package devoirs2.java.model;

public final class SessionUtilisateur {
    private static SessionUtilisateur instance;

    private static Utilisateur user;

    private SessionUtilisateur(Utilisateur user) {
        this.user = user;
    }

    public static SessionUtilisateur getInstance() {
        return instance;
    }

    public static void setSession(Utilisateur user)
    {
        instance = new SessionUtilisateur(user);
    }

    public static Utilisateur getUser() {
        return user;
    }

    public static void cleanUserSession() {
        user = null;
    }

    public static String nom() {
        return user.getNom()+" "+user.getPrenom();
    }

}
