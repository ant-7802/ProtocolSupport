package protocolsupport.api;

public enum ServerPlatformIdentifier {
    SPIGOT("Spigot");

    private final String name;

    private ServerPlatformIdentifier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
